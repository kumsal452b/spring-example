package com.kumsalyazilim.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
@Document
public class Kullanici {
    @Id
    private String id;
    private String soyad,ad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public HashMap getOzellikler() {
        return ozellikler;
    }

    public void setOzellikler(HashMap ozellikler) {
        this.ozellikler = ozellikler;
    }

    private HashMap ozellikler;


}
