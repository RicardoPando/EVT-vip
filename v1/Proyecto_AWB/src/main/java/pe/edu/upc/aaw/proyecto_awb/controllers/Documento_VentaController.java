package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.Documento_VentaDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.Documento_Venta;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IDocumento_VentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Documento Venta")
public class Documento_VentaController {
    @Autowired
    private IDocumento_VentaService dvS;

    @PostMapping
    public void registrar (@RequestBody Documento_VentaDTO dto){
        ModelMapper m = new ModelMapper();
        Documento_Venta n = m.map(dto,Documento_Venta.class);
        dvS.insert(n);
    }

    @GetMapping
    public List<Documento_VentaDTO> listar(){
        return dvS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,Documento_VentaDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dvS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Documento_VentaDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Documento_Venta n = m.map(dto,Documento_Venta.class);
        dvS.insert(n);
    }
}
