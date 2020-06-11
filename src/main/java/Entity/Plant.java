package Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;

@Entity
@Table(name="plantshop")
public class Plant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="plantname")
    private String name;
    @Column(name="colour")
    private String colour;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="sort")
    private String sort;

    static private ArrayList<Plant> plants=new ArrayList<>();

    public Plant(long id, String name, String colour, BigDecimal price, String sort) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.sort = sort;
    }

    public Plant(String name, String colour, BigDecimal price, String sort) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.sort = sort;
    }
    public Plant(Plant plant){
        this.name=plant.getName();
        this.colour=plant.getColour();
        this.price=plant.getPrice();
        this.sort=plant.getSort();
    }

    public Plant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }


}

