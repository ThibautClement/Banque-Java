package Croquis;

import Interface.Forme;

public class Carre implements Forme {

    String nom;

    public Carre() {
        this.nom = "Carré";
    }

    @Override
    public String afficherForme() {
        return this.nom;
    }
}
