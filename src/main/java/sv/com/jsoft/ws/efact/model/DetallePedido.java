package sv.com.jsoft.ws.efact.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity(name = "detalle_pedido")
public class DetallePedido extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_pedido")
    public Integer idDetallePedido;
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
    @ManyToOne(fetch = FetchType.EAGER)
    public Pedido idPedido;
    @Column(name = "id_producto")
    public Integer idProducto;
    public Boolean activo;

    public Double cantidad;
}
