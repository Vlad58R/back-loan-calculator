package com.example.app.backloancalculator.persistance;

import javax.persistence.*;

@Entity
@Table(name = "PERCENTAGE")
public class LoanPercentage {

    /**
     * This class and whole database logic was created only for demonstration purpose
     * Its not required for this kind of functionality but it might be used in different way
     * For example register clients, store data about them and use it to calculate personal risks/loan percentage etc...
     * H2 database is used so reviewers dont have to install/configure database like Postgres on their devices for this task
     * When application is running, you can access database console by this link: http://localhost:8080/h2-console/
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "percent")
    private Double percent;

    @Column(name = "type")
    private String type;

    public LoanPercentage() {
    }

    public LoanPercentage(Integer id, Double percent, String type) {
        this.id = id;
        this.percent = percent;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
