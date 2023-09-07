package sv.com.jsoft.ws.efact.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "pedido")
public class Pedido extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    public Integer idPedido;
    @Column(name = "id_cliente")
    public Integer idCliente;
    @Column(name = "id_estado_pedido")
    public Integer idEstadoPedido;
    @Column(name = "fecha_registro")
    public Date fechaRegistro;
    public String user;

    @OneToMany(mappedBy = "idPedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetallePedido> detallePedidoList;
}
