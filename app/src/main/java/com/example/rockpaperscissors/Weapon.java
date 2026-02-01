package com.example.rockpaperscissors;

public enum Weapon {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String message;

    Weapon(String msg) {
        message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
}
