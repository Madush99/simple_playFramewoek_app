package models;

import java.util.*;

public class Student {

    public Integer id;
    public String FName;
    public String LName;

    public Student(Integer id, String FName, String LName) {
        this.id = id;
        this.FName = FName;
        this.LName = LName;
    }

    public Integer getId() {
        return id;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }



}


