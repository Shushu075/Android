package com.leslielemoine.mycv;


import java.io.Serializable;

public class Experiences implements Serializable {

    private String date;
    private String poste;
    private String entreprise;
    private String lieu;

    public Experiences(String date, String poste, String entreprise, String lieu) {
        this.date = date;
        this.poste = poste;
        this.entreprise = entreprise;
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
