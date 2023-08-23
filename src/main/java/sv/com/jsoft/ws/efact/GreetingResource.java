package sv.com.jsoft.ws.efact;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.primefaces.model.rest.AutoCompleteSuggestion;
import org.primefaces.model.rest.AutoCompleteSuggestionResponse;
import sv.com.jsoft.ws.efact.model.Producto;

import java.util.List;
import java.util.stream.Collectors;

@Path("/hello")
public class GreetingResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/all")
    public List<Producto> list() {
        return Producto.listAll();
    }



    @GET
    @Path("/autocomplete")
    @Produces({MediaType.APPLICATION_JSON})
    public AutoCompleteSuggestionResponse autocomplete(@QueryParam("query") String query) {
        Log.info("ok");
        String queryLowerCase = query.toLowerCase();
        List<Producto> lstProducto = Producto.listAll();
        return new AutoCompleteSuggestionResponse(lstProducto.stream()
                .filter(t -> t.codigo.toLowerCase().contains(queryLowerCase))
                .map(t -> new AutoCompleteSuggestion(Integer.toString(t.idProducto), t.nombre))
                .collect(Collectors.toList()));
    }
}
