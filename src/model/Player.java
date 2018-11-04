package model;

public class Player extends Entity {

    String name;
    int resilience;

    public Player(String name, int resilience) {
        this.name = name;
        this.resilience = resilience;
    }

    public String getName() {
        return this.name;
    }

    public int getResilience() {
        return this.resilience;
    }
}
