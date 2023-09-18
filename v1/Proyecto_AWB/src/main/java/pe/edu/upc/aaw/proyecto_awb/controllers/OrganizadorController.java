package pe.edu.upc.aaw.proyecto_awb.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import pe.edu.upc.aaw.proyecto_awb.dtos.OrganizadorDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Organizador;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IOrganizadorService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/organizador")
public class OrganizadorController {
    @Autowired
    private IOrganizadorService oS;
    @PostMapping
    public void registrar (@RequestBody OrganizadorDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Organizador o = m.map(dto, Organizador.class);
        oS.insert(o);
    }
    @GetMapping
    public List<OrganizadorDTO> Listar()
    {
        return oS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,OrganizadorDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id")Integer id)
    {
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OrganizadorDTO ListarId (@PathVariable("id")Integer id)
    {
        ModelMapper m=new ModelMapper();
        OrganizadorDTO dto=m.map(oS.ListId(id),OrganizadorDTO.class);
        return dto;
    }
    public void Modificar (@RequestBody OrganizadorDTO dto){
        ModelMapper m= new ModelMapper();
        Organizador p = m.map(dto,Organizador.class);
        oS.insert(p);
    }
}
