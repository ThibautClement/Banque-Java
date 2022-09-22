package Glaces;

public class Sorbet implements Glaces{

    String nom;

    public Sorbet() {
        this.nom = "Sorbet";
    }

    @Override
    public String manger() {
        return this.nom;
    }
}
