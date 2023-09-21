package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.LugaresDTO;
import pe.edu.upc.aaw.proyecto_awb.dtos.UsuarioDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Lugares;
import pe.edu.upc.aaw.proyecto_awb.entities.Usuario;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ILugaresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lugares")
public class LugaresController {
    @Autowired
    private ILugaresService ils;

    @PostMapping
    public void registrar(@RequestBody LugaresDTO dto){
        ModelMapper m= new ModelMapper();
        Lugares l = m.map(dto, Lugares.class);
        ils.insertar(l);
    }
    @GetMapping
    public List<LugaresDTO> listar(){
        return ils.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x,LugaresDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        ils.delete(id);
    }

    @GetMapping("/{id}")
    public LugaresDTO listarID(@PathVariable ("id") Integer id)
    {
        ModelMapper m= new ModelMapper();
        LugaresDTO dto = m.map(ils.listID(id),LugaresDTO.class);
        return dto;
    }

    @PutMapping
    public void Modificar (@RequestBody LugaresDTO dto){
        ModelMapper m= new ModelMapper();
        Lugares u = m.map(dto,Lugares.class);
        ils.insertar(u);
    }
}
