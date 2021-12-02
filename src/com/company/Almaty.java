package com.company;

public class Almaty {
    int ploshad,naselenie;

    public Almaty(int ploshad,int naselenie) {
        this.ploshad=ploshad;
        this.naselenie = naselenie;
    }

    @Override
    public String toString() {
        return "Almaty{" +
                "ploshad=" + ploshad +
                ", naselenie=" + naselenie +
                '}';
    }
}
