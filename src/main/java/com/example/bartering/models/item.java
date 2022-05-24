package com.example.bartering.models;


import javax.persistence.*;

@Entity
@Table(name = "item")
public class item {
    private int id;
    private String name;
    private String description;
    private String producttype;
    private String expectations;
    private String quantity;
    private String image;
    private int sellerid;
    private String inserteddate;

    public item(){

    }

    public item(int id, String name, String inserteddate, String description, String expectations, String image, String producttype, String quantity, int sellerid) {
        this.id = id;
        this.name = name;
        this.inserteddate = inserteddate;
        this.description = description;
        this.expectations = expectations;
        this.image = image;
        this.producttype = producttype;
        this.quantity = quantity;
        this.sellerid = sellerid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInserteddate() {
        return inserteddate;
    }

    public void setInserteddate(String inserteddate) {
        this.inserteddate = inserteddate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpectations() {
        return expectations;
    }

    public void setExpectations(String expectations) {
        this.expectations = expectations;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }
}
