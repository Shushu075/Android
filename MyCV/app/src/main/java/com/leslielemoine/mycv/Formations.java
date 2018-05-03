package com.leslielemoine.mycv;


import java.io.Serializable;

public class Formations implements Serializable {

    private String date;
    private String etude;
    private String lieu;

    public Formations(String date, String etude, String lieu) {
        this.date = date;
        this.etude = etude;
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEtude() {
        return etude;
    }

    public void setEtude(String etude) {
        this.etude = etude;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
