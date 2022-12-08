package za.co.sar.solar.control;

import za.co.sar.solar.entity.Planet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class PlanetService {

    @Inject
    EntityManager em;
    public List<Planet> findAll() {
        return em.createNamedQuery(Planet.FIND_ALL_PLANETS, Planet.class).getResultList();
    }

}
