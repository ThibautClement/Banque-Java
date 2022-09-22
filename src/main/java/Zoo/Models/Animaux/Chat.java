package Zoo.Models.Animaux;

import Zoo.Abstract.Animal;
import Zoo.Interfaces.Terrestre;

public class Chat extends Animal implements Terrestre {

    String nom;

    public Chat() {
        this.nom = "Chat";
    }

    @Override
    public String marcher() {
        String rep = "Je suis un " + this.nom + " et je marche";
        return rep;
    }
}
