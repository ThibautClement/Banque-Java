package Glaces;

public class Granite implements Glaces {

    String nom;

    public Granite() {
        this.nom = "Granite";
    }

    @Override
    public String manger() {
        return this.nom;
    }
}
