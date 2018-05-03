package com.leslielemoine.mycv;


import java.io.Serializable;

public class Competences implements Serializable {

    private String langageComp;
    private String pictureComp;

    public Competences(String langageComp, String pictureComp) {
        this.langageComp = langageComp;
        this.pictureComp = pictureComp;
    }

    public String getLangageComp() {
        return langageComp;
    }

    public void setLangageComp(String langageComp) {
        this.langageComp = langageComp;
    }

    public String getPictureComp() {
        return pictureComp;
    }

    public void setPictureComp(String pictureComp) {
        this.pictureComp = pictureComp;
    }
}
