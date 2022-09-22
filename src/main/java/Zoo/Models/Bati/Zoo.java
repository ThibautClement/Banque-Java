package Zoo.Models.Bati;

import Zoo.Abstract.Conteneur;

import java.util.ArrayList;

public class Zoo {

    public int id;

    public ArrayList<Conteneur> listEnclos = new ArrayList<>();

    public Zoo(int id, ArrayList<Conteneur> listEnclos) {
        this.id = id;
        this.listEnclos = listEnclos;
    }
}
