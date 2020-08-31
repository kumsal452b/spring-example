package com.kumsalyazilim.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
@Document
public class Kullanici {
    @Id
    private String id;
    private String soyad,ad;
    private HashMap ozellikler;


}
