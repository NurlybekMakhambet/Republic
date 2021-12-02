package com.company;

public class NurSultan {
    int ploshad,naselenie;

    public NurSultan(int ploshad,int naselenie){
        this.ploshad=ploshad;
        this.naselenie=naselenie;
    }

    @Override
    public String toString() {
        return "NurSultan{" +
                "ploshad=" + ploshad +
                ", naselenie=" + naselenie +
                '}';
    }
}
