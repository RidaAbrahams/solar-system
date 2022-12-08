package za.co.sar.solar.entity;

import javax.persistence.*;

@Entity(name = "t_planet")
@Table(name = "t_planet")
@NamedQuery(name = Planet.FIND_ALL_PLANETS, query = "select p from t_planet p order by p.id")
public class Planet {

    public static final String FIND_ALL_PLANETS = "findAllPlanets";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String planetName;

    public Planet() {
    }

    public Planet(String planetName) {
        this.planetName = planetName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", planetName='" + planetName + '\'' +
                '}';
    }
}
