package pe.edu.upc.aww.comentario.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.comentario.dtos.ComentarioDTO;
import pe.edu.upc.aww.comentario.entities.Comentario;
import pe.edu.upc.aww.comentario.serviceinterfaces.IComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private IComentarioService cS;

    @PostMapping
    private void registrar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody ComentarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentario a = m.map(dto, Comentario.class);
        cS.insert(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(cS.listarId(id), ComentarioDTO.class);
        return dto;
    }


}
