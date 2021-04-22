
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventario implements Serializable {
    @Id
    private Long numero_solicitud;

    public Inventario() {
    }

    public Long getNumero_solicitud() {
        return numero_solicitud;
    }

    public void setNumero_solicitud(Long numero_solicitud) {
        this.numero_solicitud = numero_solicitud;
    }
    
}
