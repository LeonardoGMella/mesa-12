
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {
    @Id
    private Producto prod_pedidos;
    private Long cantidad_pedidos;
    private Long Num_solicitud;

    public Pedido() {
    }

    public Producto getProd_pedidos() {
        return prod_pedidos;
    }

    public void setProd_pedidos(Producto prod_pedidos) {
        this.prod_pedidos = prod_pedidos;
    }

    public Long getCantidad_pedidos() {
        return cantidad_pedidos;
    }

    public void setCantidad_pedidos(Long cantidad_pedidos) {
        this.cantidad_pedidos = cantidad_pedidos;
    }

    public Long getNum_solicitud() {
        return Num_solicitud;
    }

    public void setNum_solicitud(Long Num_solicitud) {
        this.Num_solicitud = Num_solicitud;
    }
    
}
