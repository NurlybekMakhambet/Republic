package com.company;

public class Kazakhstan extends Republic {
    int ploshad,hmtown, hmmegapolis,naselenie;
    String capital,namemegapolis;

    public Kazakhstan(String name, int ploshad, int hmtown, int hmmegapolis, int naselenie, String capital, String namemegapolis) {
        super(name);
        this.ploshad = ploshad;
        this.hmtown = hmtown;
        this.hmmegapolis = hmmegapolis;
        this.naselenie = naselenie;
        this.capital = capital;
        this.namemegapolis = namemegapolis;
    }

    @Override
    public String toString() {
        return "Kazakhstan{" +
                "ploshad=" + ploshad +
                ", hmtown=" + hmtown +
                ", hmmegapolis=" + hmmegapolis +
                ", naselenie=" + naselenie +
                ", capital='" + capital + '\'' +
                ", namemegapolis='" + namemegapolis + '\'' +
                '}';
    }
}

