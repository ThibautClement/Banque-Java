package Zoo.Models.Animaux;

import Zoo.Abstract.Animal;
import Zoo.Interfaces.Aquatique;

public class Dauphin extends Animal implements Aquatique {

    String nom;

    public Dauphin() {
        this.nom = "Dauphin";
    }

    @Override
    public String nager() {
        String rep = "Je suis un " + this.nom + " et je nage";
        return rep;
    }
}
