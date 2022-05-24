package com.example.bartering.models;


import javax.persistence.*;

@Entity
@Table(name = "items")
public class itemresp {
    private int id;
    private String name;
    private String description;
    private String expectations;
    private String itemimage;
    private String producttype;
    private String quantity;
    private int sellerid;
    private String inserteddate;

    public itemresp(){

    }

    public itemresp(int id, String name, String description, String expectations, String itemimage, String producttype, String quantity, int sellerid, String inserteddate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.expectations = expectations;
        this.itemimage = itemimage;
        this.producttype = producttype;
        this.quantity = quantity;
        this.sellerid = sellerid;
        this.inserteddate = inserteddate;
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

    public String getItemimage() {
        return itemimage;
    }

    public void setItemimage(String itemimage) {
        this.itemimage = itemimage;
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

    public String getInserteddate() {
        return inserteddate;
    }

    public void setInserteddate(String inserteddate) {
        this.inserteddate = inserteddate;
    }
}
