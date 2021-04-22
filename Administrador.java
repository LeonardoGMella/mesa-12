
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrador implements Serializable {
    @Id
  private Proveedor proveedores;  
    private String nombre;
    private String ayudame_gbus;
    public Administrador() {
    }

    public Proveedor getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor proveedores) {
        this.proveedores = proveedores;
    }
    
}
