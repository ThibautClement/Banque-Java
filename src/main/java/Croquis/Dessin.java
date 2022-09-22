package Croquis;

import Interface.Forme;
import java.util.ArrayList;

public class Dessin {

    ArrayList<Forme> listForme = new ArrayList<>();

    public Dessin(ArrayList<Forme> listForme) {
        this.listForme = listForme;
    }

    public void dessin() {
        for (Forme item: this.listForme) {
            System.out.println(item.afficherForme());
        }
    }


}
