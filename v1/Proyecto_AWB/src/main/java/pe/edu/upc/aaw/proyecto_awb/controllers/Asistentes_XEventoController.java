package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.Asistentes_XEventoDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEvento;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IAsisntetes_XEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("asistentes_xeventos")
public class Asistentes_XEventoController {

    @Autowired
    private IAsisntetes_XEventoService axE;

    @PostMapping
    public void registrar(@RequestBody Asistentes_XEventoDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Usuarios_XEvento a = m.map(dto, Usuarios_XEvento.class);
        axE.insertar(a);
    }

    @GetMapping
    public List<Asistentes_XEventoDTO> listar(){
        return axE.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x, Asistentes_XEventoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        axE.delete(id);
    }


    @GetMapping("/{id}")
    public Asistentes_XEventoDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        Asistentes_XEventoDTO dto= m.map(axE.listID(id),Asistentes_XEventoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Asistentes_XEventoDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Usuarios_XEvento a = m.map(dto, Usuarios_XEvento.class);
        axE.insertar(a);
    }
}
