package com.example.ehr.models;


import javax.persistence.*;

@Entity
@Table(name = "negotiations")
public class negotiations {
    private int id;
    private int receiverid;
    private int sellerid;
    private int borroweitemid;
    private int solditemid;
    private String status;
    private String borrowitemowner;
    private String borrowitemimage;
    private String solditemimage;
    private String solditemname;
    private String borrowitemname;
    private String selleritemowner;
    private String solditemprice;
    private String borrowitemprice;


    public negotiations(){

    }

    public negotiations(int id, int receiverid, int sellerid, int borroweitemid, int solditemid, String status, String borrowitemowner, String borrowitemimage, String solditemimage, String solditemname, String borrowitemname, String selleritemowner, String solditemprice, String borrowitemprice) {
        this.id = id;
        this.receiverid = receiverid;
        this.sellerid = sellerid;
        this.borroweitemid = borroweitemid;
        this.solditemid = solditemid;
        this.status = status;
        this.borrowitemowner = borrowitemowner;
        this.borrowitemimage = borrowitemimage;
        this.solditemimage = solditemimage;
        this.solditemname = solditemname;
        this.borrowitemname = borrowitemname;
        this.selleritemowner = selleritemowner;
        this.solditemprice = solditemprice;
        this.borrowitemprice = borrowitemprice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(int receiverid) {
        this.receiverid = receiverid;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public int getBorroweitemid() {
        return borroweitemid;
    }

    public void setBorroweitemid(int borroweitemid) {
        this.borroweitemid = borroweitemid;
    }

    public int getSolditemid() {
        return solditemid;
    }

    public void setSolditemid(int solditemid) {
        this.solditemid = solditemid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBorrowitemowner() {
        return borrowitemowner;
    }

    public void setBorrowitemowner(String borrowitemowner) {
        this.borrowitemowner = borrowitemowner;
    }

    public String getBorrowitemimage() {
        return borrowitemimage;
    }

    public void setBorrowitemimage(String borrowitemimage) {
        this.borrowitemimage = borrowitemimage;
    }

    public String getSolditemimage() {
        return solditemimage;
    }

    public void setSolditemimage(String solditemimage) {
        this.solditemimage = solditemimage;
    }

    public String getSolditemname() {
        return solditemname;
    }

    public void setSolditemname(String solditemname) {
        this.solditemname = solditemname;
    }

    public String getBorrowitemname() {
        return borrowitemname;
    }

    public void setBorrowitemname(String borrowitemname) {
        this.borrowitemname = borrowitemname;
    }

    public String getSelleritemowner() {
        return selleritemowner;
    }

    public void setSelleritemowner(String selleritemowner) {
        this.selleritemowner = selleritemowner;
    }

    public String getSolditemprice() {
        return solditemprice;
    }

    public void setSolditemprice(String solditemprice) {
        this.solditemprice = solditemprice;
    }

    public String getBorrowitemprice() {
        return borrowitemprice;
    }

    public void setBorrowitemprice(String borrowitemprice) {
        this.borrowitemprice = borrowitemprice;
    }
}
