package eserciziJavaAdvanced.classiPerEsercizio9;

import eserciziJavaAdvanced.classiPerEsercizio9.Playable;

public class Instrument implements Playable {
    String name;
    String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("i'm actually playing");
    }
}
