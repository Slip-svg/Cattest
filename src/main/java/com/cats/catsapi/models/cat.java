// package com.cats.catsapi.models;

import org.apache.logging.log4j.util.Strings;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

// import org.apache.logging.log4j.util.Strings;

// import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "cats")
public class cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcat;
    private String catdesc;
    private String catname;
    private String imglocation;

//Getters and Setters
    public int getCatID(){
        return catid;

    }
    public void setCatID(int id){
        this.catid = id;
    }
    public String getCatDesc(){
        return catdesc;

    }
    public void setCatDesc(String desc){
        this.catdesc = desc;
    }

    public String getCatName(){
        return catname;

    }
    public void setCatName(String name){
        this.catname = name;
    }

    public String getCatImg(){
        return imglocation;

    }
    public void setCatImg(String location){
        this.imglocation = location;
    }

    }