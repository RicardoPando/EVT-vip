package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.UsuarioDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Users;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m= new ModelMapper();
        Users u = m.map(dto,Users.class);
        uS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m =  new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        uS.delete(id);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public UsuarioDTO listarID(@PathVariable ("id") Integer id)
    {
        ModelMapper m= new ModelMapper();
        UsuarioDTO dto = m.map(uS.listID(id),UsuarioDTO.class);
        return dto;
    }

    @PutMapping
    public void Modificar (@RequestBody UsuarioDTO dto){
        ModelMapper m= new ModelMapper();
        Users u = m.map(dto,Users.class);
        uS.insert(u);
    }
    @GetMapping("/comentByPerson")
    @PreAuthorize("hasAuthority('ASISTENTE')")
    public List<comentByPerson>  comentByPerson() {
        List<String[]> lista = eR.comentByPerson();
        List<comentByPerson> lista
    }

}
