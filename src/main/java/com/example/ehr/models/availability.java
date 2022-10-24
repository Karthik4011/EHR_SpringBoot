package com.example.ehr.models;
import javax.persistence.*;


@Entity
@Table(name = "availability")
public class availability {
    private int id;
    private int doctorid;
    private String adate;

    public availability() {
    }

    public availability(int id, int doctorid, String adate) {
        this.id = id;
        this.doctorid = doctorid;
        this.adate = adate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getAdate() {
        return adate;
    }

    public void setAdate(String adate) {
        this.adate = adate;
    }
}
