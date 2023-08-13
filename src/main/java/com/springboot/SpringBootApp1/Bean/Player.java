package com.springboot.SpringBootApp1.Bean;

public class Player {

    private int jersey;
    private String name;
    private String team;
    private String role;

    public Player(int jersey, String name, String team, String role) {
        this.jersey = jersey;
        this.name = name;
        this.team = team;
        this.role = role;
    }

    public int getJersey() {
        return jersey;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getRole() {
        return role;
    }
}

