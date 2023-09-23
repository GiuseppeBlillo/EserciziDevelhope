package eserciziSpringBoot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MEAL")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "WINTER")
    private boolean winter;

    public Meal(Long id, String name, String description, double price, boolean winter) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.winter = winter;
    }

    public Meal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWinter() {
        return winter;
    }

    public void setWinter(boolean w) {
        winter = w;
    }

    public Meal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
