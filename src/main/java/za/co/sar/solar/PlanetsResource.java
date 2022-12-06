package za.co.sar.solar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("api/planets")
@Produces(MediaType.APPLICATION_JSON)
public class PlanetsResource {

    @GET
    public Response getAll() {
        return Response.ok(Collections.singletonMap("Planets v1", "Earth, Mars, Jupiter")).build();
    }
}
