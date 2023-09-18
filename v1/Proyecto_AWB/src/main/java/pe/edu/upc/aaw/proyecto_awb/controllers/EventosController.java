package pe.edu.upc.aaw.proyecto_awb.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import pe.edu.upc.aaw.proyecto_awb.dtos.EventosDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Eventos;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IEventosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventosController {
@Autowired
    private IEventosService eS;
    @PostMapping
    public void registrar (@RequestBody EventosDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Eventos e = m.map(dto, Eventos.class);
        eS.insertar(e);
    }
    @GetMapping
    public List<EventosDTO> Listar()
    {
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,EventosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id")Integer id)
    {
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EventosDTO ListarId (@PathVariable("id")Integer id)
    {
        ModelMapper m=new ModelMapper();
        EventosDTO dto=m.map(eS.ListId(id),EventosDTO.class);
        return dto;
    }
    public void Modificar (@RequestBody EventosDTO dto){
        ModelMapper m= new ModelMapper();
        Eventos p = m.map(dto,Eventos.class);
        eS.insertar(p);
    }
}
