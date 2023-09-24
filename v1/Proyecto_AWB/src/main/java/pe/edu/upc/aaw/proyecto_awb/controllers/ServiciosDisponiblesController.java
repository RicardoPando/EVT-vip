package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.ServiciosDisponiblesDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServiciosDispoblesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Servicios Disponibles")
public class ServiciosDisponiblesController {
    @Autowired
    private IServiciosDispoblesService sdS;

    @PostMapping
    public void registrar (@RequestBody ServiciosDisponiblesDTO dto){
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto, Servicios.class);
        sdS.insert(n);
    }

    @GetMapping
    public List<ServiciosDisponiblesDTO> listar(){
        return sdS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ServiciosDisponiblesDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sdS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ServiciosDisponiblesDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto, Servicios.class);
        sdS.insert(n);
    }
}
