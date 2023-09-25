package pe.edu.upc.aaw.proyecto_awb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.proyecto_awb.dtos.ComprobantePagoDTO;
import pe.edu.upc.aaw.proyecto_awb.dtos.Usuarios_XEventoDTO;
import pe.edu.upc.aaw.proyecto_awb.entities.ComprobantePago;
import pe.edu.upc.aaw.proyecto_awb.serviceinterfaces.IComprobantePagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("comprobantepago")
public class ComprobantePagoController {
    @Autowired
    private IComprobantePagoService cpS;

    @PostMapping
    public void registrar (@RequestBody ComprobantePagoDTO dto){
        ModelMapper m = new ModelMapper();
        ComprobantePago n = m.map(dto, ComprobantePago.class);
        cpS.insertar(n);
    }

    @GetMapping
    public List<ComprobantePagoDTO> listar(){
        return cpS.list().stream().map((x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComprobantePagoDTO.class);
        })).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cpS.delete(id);
    }

    @GetMapping("/{id}")
    public ComprobantePagoDTO listarID(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        ComprobantePagoDTO dto= m.map(cpS.listID(id), ComprobantePagoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ComprobantePagoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        ComprobantePago n = m.map(dto, ComprobantePago.class);
        cpS.insertar(n);
    }
}
