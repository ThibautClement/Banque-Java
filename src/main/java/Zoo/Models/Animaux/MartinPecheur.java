package Zoo.Models.Animaux;

import Zoo.Abstract.Animal;
import Zoo.Interfaces.Aquatique;
import Zoo.Interfaces.Volatile;

public class MartinPecheur extends Animal implements Volatile, Aquatique {

    String nom;

    public MartinPecheur() {
        this.nom = "Martin Pecheur";
    }

    @Override
    public String nager() {
        String rep = "Je suis un " + this.nom + " et je nage";
        return rep;
    }

    @Override
    public String voler() {
        String rep = "Je suis un " + this.nom + " et je vole";
        return rep;
    }

}
