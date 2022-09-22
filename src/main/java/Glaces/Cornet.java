package Glaces;

public class Cornet implements Glaces {

    String nom;

    public Cornet() {
        this.nom = "Cornet";
    }

    @Override
    public String manger() {
        return this.nom;
    }
}
