package ZooParle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    ArrayList<Animaux> listAnimaux = new ArrayList<Animaux>();

    public Zoo(ArrayList<Animaux> listAnimaux) {
        this.listAnimaux = listAnimaux;
    }

    public void parler() {
        for (Animaux item: this.listAnimaux) {
            System.out.println("Je suis un " + item.nom + " qui fait " + item.parler());
        }
    }
}
