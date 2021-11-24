package com.filter.filter.entity;

public class Student {

    private int id;
    private String name;
    private String standared;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandared() {
        return standared;
    }

    public void setStandared(String standared) {
        this.standared = standared;
    }

    public Student() {
    }

    public Student(int id, String name, String standared) {
        this.id = id;
        this.name = name;
        this.standared = standared;
    }

}
