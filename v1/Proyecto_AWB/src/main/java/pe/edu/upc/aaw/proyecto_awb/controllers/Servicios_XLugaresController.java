package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.Servicios_XLugaresDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Servicios_XLugares;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IServicios_XLugaresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/serviciosxlugares")
public class Servicios_XLugaresController {
    @Autowired
    private IServicios_XLugaresService slS;

    @PostMapping
    public void registrar(@RequestBody Servicios_XLugaresDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Servicios_XLugares s = m.map(dto,Servicios_XLugares.class);
        slS.insertar(s);
    }

    @GetMapping
    public List<Servicios_XLugaresDTO> listar(){
        return slS.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x, Servicios_XLugaresDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        slS.delete(id);
    }

    @GetMapping("/{id}")
    public Servicios_XLugaresDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        Servicios_XLugaresDTO dto= m.map(slS.listID(id),Servicios_XLugaresDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Servicios_XLugaresDTO dto)
    {
        ModelMapper m= new ModelMapper();
        Servicios_XLugares s = m.map(dto,Servicios_XLugares.class);
        slS.insertar(s);
    }
}
