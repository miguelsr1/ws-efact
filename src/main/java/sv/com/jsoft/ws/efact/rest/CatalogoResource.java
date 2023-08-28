package sv.com.jsoft.ws.efact.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sv.com.jsoft.ws.efact.model.Departamento;
import sv.com.jsoft.ws.efact.model.Municipio;

import java.util.List;

@Path("/catalogos")
public class CatalogoResource {

    @GET
    @Path("/departamento")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Departamento> getDepartamentos(){
        return Departamento.listAll();
    }

    @GET
    @Path("/municipio/{cod}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Municipio> getMunicipioByDepa(@PathParam("cod") String codigoDepa){
        return Municipio.list("codigoDepartamento=?1", codigoDepa);
    }
}
