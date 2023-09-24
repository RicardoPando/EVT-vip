package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.ServiciosDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServiciosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Servicios Disponibles")
public class ServiciosController {
    @Autowired
    private IServiciosService sdS;

    @PostMapping
    public void registrar (@RequestBody ServiciosDTO dto){
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto,Servicios.class);
        sdS.insert(n);
    }

    @GetMapping
    public List<ServiciosDTO> listar(){
        return sdS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ServiciosDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sdS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ServiciosDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Servicios n = m.map(dto,Servicios.class);
        sdS.insert(n);
    }
}
