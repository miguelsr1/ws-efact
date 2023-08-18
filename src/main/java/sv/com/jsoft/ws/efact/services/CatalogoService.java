package sv.com.jsoft.ws.efact.services;

import jakarta.enterprise.context.ApplicationScoped;
import sv.com.jsoft.ws.efact.model.Producto;
import java.util.List;

@ApplicationScoped
public class CatalogoService {
    private List<Producto> lstProducto;

    {
        lstProducto = Producto.listAll();
    }

    public void updateListProducto() {
        lstProducto = Producto.listAll();
    }
}
