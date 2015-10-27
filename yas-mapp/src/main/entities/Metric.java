package src.main.entities;

import javax.persistence.*;
import  src.main.entities.MetricConstant.MetricType;
import  src.main.entities.MetricConstant.MetricCategory;

/**
 * Created by Salman on 10/26/2015.
 */
@Entity
public class Metric {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "metric")
    @Enumerated(EnumType.STRING)
    MetricType metric;
    private String description;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private MetricCategory category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MetricType getMetric() {
        return metric;
    }

    public void setMetric(MetricType metric) {
        this.metric = metric;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetricCategory getCategory() {
        return category;
    }

    public void setCategory(MetricCategory category) {
        this.category = category;
    }
}
