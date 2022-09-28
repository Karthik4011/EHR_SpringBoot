package com.example.ehr.models;


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
    private String price;


    public item(){

    }

    public item(int id, String name, String description, String producttype, String expectations, String quantity, String image, int sellerid, String inserteddate, String price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.producttype = producttype;
        this.expectations = expectations;
        this.quantity = quantity;
        this.image = image;
        this.sellerid = sellerid;
        this.inserteddate = inserteddate;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
