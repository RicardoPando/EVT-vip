package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.AsistentesDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Asistentes;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IAsistentesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Asistentes")
public class AsistentesController {
    @Autowired
    private IAsistentesService asS;

    @PostMapping
    public void registrar (@RequestBody AsistentesDTO dto){
        ModelMapper m = new ModelMapper();
        Asistentes n = m.map(dto,Asistentes.class);
        asS.insert(n);
    }

    @GetMapping
    public List<AsistentesDTO> listar(){
        return asS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,AsistentesDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        asS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody AsistentesDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Asistentes n = m.map(dto,Asistentes.class);
        asS.insert(n);
    }
}
