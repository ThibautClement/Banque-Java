package Croquis;

import Interface.Forme;

public class Triangle implements Forme {

    String nom;

    public Triangle() {
        this.nom = "Triangle";
    }

    @Override
    public String afficherForme() {
        return this.nom;
    }
}
