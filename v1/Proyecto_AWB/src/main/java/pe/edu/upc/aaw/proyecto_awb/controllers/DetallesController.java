package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.DetallesDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalles;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDetallesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detalles")
public class DetallesController {
    @Autowired
    private IDetallesService dT;

    @PostMapping
    public void registrar(@RequestBody DetallesDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Detalles d = m.map(dto, Detalles.class);
        dT.insertar(d);
    }

    @GetMapping
    public List<DetallesDTO> listar(){
        return dT.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x, DetallesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dT.delete(id);
    }

    @GetMapping("/{id}")
    public DetallesDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        DetallesDTO dto= m.map(dT.listID(id), DetallesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody DetallesDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Detalles d = m.map(dto, Detalles.class);
        dT.insertar(d);
    }
}
