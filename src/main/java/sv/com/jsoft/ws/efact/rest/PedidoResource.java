package sv.com.jsoft.ws.efact.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sv.com.jsoft.ws.efact.model.Pedido;
import sv.com.jsoft.ws.efact.model.TipoUnidadMedida;

import java.util.List;

@Path("pedido")
public class PedidoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> findAll(){
        return Pedido.listAll();
    }
}
