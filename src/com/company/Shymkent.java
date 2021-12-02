package com.company;

import java.util.Objects;

public class Shymkent {
    int ploshad,naselenie;

    public Shymkent(int ploshad,int naselenie) {
        this.ploshad=ploshad;
        this.naselenie = naselenie;
    }

    @Override
    public String toString() {
        return "Shymkent{" +
                "ploshad=" + ploshad +
                ", naselenie=" + naselenie +
                '}';
    }
}
