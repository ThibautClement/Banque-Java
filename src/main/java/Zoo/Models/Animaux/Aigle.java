package Zoo.Models.Animaux;

import Zoo.Abstract.Animal;
import Zoo.Interfaces.Volatile;

public class Aigle extends Animal implements Volatile {

    String nom;

    public Aigle() {
        this.nom = "Aigle";
    }

    @Override
    public String voler() {
        String rep = "Je suis un " + this.nom + " et je vole";
        return rep;
    }
}
