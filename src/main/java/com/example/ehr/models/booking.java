package com.example.ehr.models;
import javax.persistence.*;


@Entity
@Table(name = "booking")
public class booking {
    private int bookingid;
    private int patientid;
    private int doctorid;
    private String bookingdate;

    public booking() {
    }

    public booking(int bookingid, int patientid, int doctorid, String bookingdate) {
        this.bookingid = bookingid;
        this.patientid = patientid;
        this.doctorid = doctorid;
        this.bookingdate = bookingdate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }


    public String getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }
}
