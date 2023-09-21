package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.DetalleDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Detalle;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDetalleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detalles")
public class DetalleController {
    @Autowired
    private IDetalleService dT;

    @PostMapping
    public void registrar(@RequestBody DetalleDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Detalle d = m.map(dto,Detalle.class);
        dT.insertar(d);
    }

    @GetMapping
    public List<DetalleDTO> listar(){
        return dT.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x, DetalleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dT.delete(id);
    }

    @GetMapping("/{id}")
    public DetalleDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        DetalleDTO dto= m.map(dT.listID(id),DetalleDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody DetalleDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Detalle d = m.map(dto,Detalle.class);
        dT.insertar(d);
    }
}
