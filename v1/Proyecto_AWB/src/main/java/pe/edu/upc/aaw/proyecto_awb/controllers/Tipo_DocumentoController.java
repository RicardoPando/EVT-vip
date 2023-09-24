package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.Tipo_DocumentoDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.TipoComprobante;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.ITipo_DocumentoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo documento")
public class Tipo_DocumentoController {
    @Autowired
    private ITipo_DocumentoService tdS;

    @PostMapping
    public void registrar(@RequestBody Tipo_DocumentoDTO dto){
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto, TipoComprobante.class);
        tdS.insertar(o);
    }

    @GetMapping
    public List<Tipo_DocumentoDTO> listar(){
        return tdS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,Tipo_DocumentoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tdS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Tipo_DocumentoDTO dto)
    {
        ModelMapper m= new ModelMapper();
        TipoComprobante o = m.map(dto, TipoComprobante.class);
        tdS.insertar(o);
    }
}
