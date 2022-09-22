package Croquis;

import Interface.Forme;

public class Rond implements Forme {

    String nom;

    public Rond() {
        this.nom = "Rond";
    }

    @Override
    public String afficherForme() {
        return this.nom;
    }
}
