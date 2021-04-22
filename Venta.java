
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venta implements Serializable {
    @Id
    private Producto prod_venta;
    private Double precio;
    private Long cantidad ;

    public Venta() {
    }

    public Producto getProd_venta() {
        return prod_venta;
    }

    public void setProd_venta(Producto prod_venta) {
        this.prod_venta = prod_venta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    
}
