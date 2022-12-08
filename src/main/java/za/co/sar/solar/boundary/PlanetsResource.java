package za.co.sar.solar.boundary;

import za.co.sar.solar.control.PlanetService;
import za.co.sar.solar.entity.Planet;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;

@Path("api/planets")
@Produces(MediaType.APPLICATION_JSON)
public class PlanetsResource {
    @Inject
    PlanetService service;

    @GET
    public List<Planet> findAll() {
        return service.findAll();
    }

    @GET
    @Path("info")
    public Response getInfo() {
        return Response.ok(Collections.singletonMap("System information", "Solar system v5")).build();
    }
}
