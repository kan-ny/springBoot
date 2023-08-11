package com.springboot.SpringBootApp1.Bean;

public class Ninja {
    private int id;
    private String name;
    private String village;
    private String type;

    public Ninja(int id, String name, String village, String type) {
        this.id = id;
        this.name = name;
        this.village = village;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public String getType() {
        return type;
    }

}
