package sv.com.jsoft.ws.efact.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "producto")
public class Producto  extends PanacheEntityBase {

    @Id
    @Column(name = "id_producto")
    @GeneratedValue
    public Integer idProducto;
    public String codigo;
    public String nombre;
    @Column(name = "precio_unitario")
    public Double precioUnitario;
    public Boolean activo;

}
