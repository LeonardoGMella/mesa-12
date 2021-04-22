
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor implements Serializable {
    
    private Long telefono;
    @Id
    private Integer nit;
    private  String direccion;
    private Producto prod_provee;
    private String nombre;

    public Proveedor() {
    }
    

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getProd_provee() {
        return prod_provee;
    }

    public void setProd_provee(Producto prod_provee) {
        this.prod_provee = prod_provee;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
