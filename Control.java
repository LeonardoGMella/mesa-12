
package practica_git.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Control implements Serializable {
    @Id
   private Producto prod_control;

    public Control() {
    }

    public Producto getProd_control() {
        return prod_control;
    }

    public void setProd_control(Producto prod_control) {
        this.prod_control = prod_control;
    }
    
}
