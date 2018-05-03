package com.leslielemoine.mycv;


import java.io.Serializable;

public class Loisirs implements Serializable {

    private String loisir;
    private String pictureLoisir;

    public Loisirs(String loisir, String pictureLoisir) {
        this.loisir = loisir;
        this.pictureLoisir = pictureLoisir;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public String getPictureLoisir() {
        return pictureLoisir;
    }

    public void setPictureLoisir(String pictureLoisir) {
        this.pictureLoisir = pictureLoisir;
    }
}
