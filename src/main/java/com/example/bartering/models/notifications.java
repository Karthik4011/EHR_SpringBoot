package com.example.bartering.models;

import javax.persistence.*;


@Entity
@Table(name = "notifications")
public class notifications {
    private int id;
    private int userid;
    private String message;
    private String seller;
    private String buyer;
    private String ndate;

    public notifications(){

    }

    public notifications(int id, int userid, String message, String seller, String buyer, String ndate) {
        this.id = id;
        this.userid = userid;
        this.message = message;
        this.seller = seller;
        this.buyer = buyer;
        this.ndate = ndate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getNdate() {
        return ndate;
    }

    public void setNdate(String ndate) {
        this.ndate = ndate;
    }
}
