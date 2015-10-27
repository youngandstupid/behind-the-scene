package src.main.entities;

import javax.persistence.*;

/**
 * Created by Salman on 10/27/2015.
 */

@Entity
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "facility")
    @Enumerated(EnumType.STRING)
    private FacilityConstant facility;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFacility(FacilityConstant facility) {
        this.facility = facility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
