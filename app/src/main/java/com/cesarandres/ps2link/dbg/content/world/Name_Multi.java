package com.cesarandres.ps2link.dbg.content.world;

import com.cesarandres.ps2link.dbg.DBGCensus;

public class Name_Multi {
    private String de;
    private String en;
    private String es;
    private String fr;
    private String it;
    private String tr;

    public String getDe() {
        return this.de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEn() {
        return this.en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return this.es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return this.fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getIt() {
        return this.it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getTr() {
        return this.tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getLocalizedName() {
        switch (DBGCensus.currentLang) {
            case DE:
                return this.de;
            case ES:
                return this.es;
            case FR:
                return this.fr;
            case IT:
                return this.it;
            case TR:
                return this.tr;
            case EN:
            default:
                return this.en;
        }
    }
}
