package pe.edu.upc.aaw.proyecto_awb.dtos;

import pe.edu.upc.aaw.proyecto_awb.entities.Usuario;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OrganizadorDTO {
    private int id;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
