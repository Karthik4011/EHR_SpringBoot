package com.example.ehr.models;
import javax.persistence.*;


@Entity
@Table(name = "documents")
public class documents {
    private int id;
    private int userid;
    private String documenturl;
    private String documentname;


    public documents() {
    }

    public documents(int id, int userid, String documenturl, String documentname) {
        this.id = id;
        this.userid = userid;
        this.documenturl = documenturl;
        this.documentname = documentname;
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

    public String getDocumenturl() {
        return documenturl;
    }

    public void setDocumenturl(String documenturl) {
        this.documenturl = documenturl;
    }

    public String getDocumentname() {
        return documentname;
    }

    public void setDocumentname(String documentname) {
        this.documentname = documentname;
    }
}
