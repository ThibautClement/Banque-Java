package Croquis;

import Interface.Forme;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Carre carre = new Carre();
        Triangle triangle = new Triangle();
        Rond rond = new Rond();

        ArrayList<Forme> listForme = new ArrayList<>(Arrays.asList(carre, triangle, rond));

        Dessin dessin = new Dessin(listForme);

        dessin.dessin();
    }
}
