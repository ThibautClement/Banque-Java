package ZooParle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Chat chat = new Chat("chat", "miaou");
        Chien chien = new Chien("chien", "waf");
        Oiseau oiseau = new Oiseau("oiseau", "cuicui");

        ArrayList<Animaux> listAnimaux = new ArrayList<Animaux>(Arrays.asList(chat, chien, oiseau));

        Zoo zoo = new Zoo(listAnimaux);

        zoo.parler();
    }
}
