package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.Usuarios_XEventoDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuarios_XEventos;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.Usuarios_XEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("usuarios_xeventocontroller")
public class Usuarios_XEventoController {

    @Autowired
    private Usuarios_XEventoService axE;

    @PostMapping
    public void registrar(@RequestBody Usuarios_XEventoDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Usuarios_XEventos a = m.map(dto, Usuarios_XEventos.class);
        axE.insertar(a);
    }

    @GetMapping
    public List<Usuarios_XEventoDTO> listar(){
        return axE.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x, Usuarios_XEventoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        axE.delete(id);
    }


    @GetMapping("/{id}")
    public Usuarios_XEventoDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        Usuarios_XEventoDTO dto= m.map(axE.listID(id), Usuarios_XEventoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Usuarios_XEventoDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Usuarios_XEventos a = m.map(dto, Usuarios_XEventos.class);
        axE.insertar(a);
    }
}
