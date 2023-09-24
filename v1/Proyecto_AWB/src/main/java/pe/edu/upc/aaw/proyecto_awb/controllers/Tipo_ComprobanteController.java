package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.TipoComprobanteDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ITipoComprobanteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo comprobante")
public class Tipo_ComprobanteController {
    @Autowired
    private ITipoComprobanteService tdS;

    @PostMapping
    public void registrar(@RequestBody TipoComprobanteDTO dto){
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto,TipoComprobante.class);
        tdS.insertar(o);
    }

    @GetMapping
    public List<TipoComprobanteDTO> listar(){
        return tdS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,TipoComprobanteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tdS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody TipoComprobanteDTO dto)
    {
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto,TipoComprobante.class);
        tdS.insertar(o);
    }
}
