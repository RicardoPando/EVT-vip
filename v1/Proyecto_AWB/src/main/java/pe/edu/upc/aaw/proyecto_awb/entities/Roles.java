package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoles;

    private String rol;


    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users users;

    public Roles() {

    }

    public Roles(int idRoles, String rol, Users users) {
        this.idRoles = idRoles;
        this.rol = rol;
        this.users = users;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
