package Zoo.Models.Bati;

import Zoo.Abstract.Conteneur;
import Zoo.Interfaces.Terrestre;
import java.util.ArrayList;

public class Cage extends Conteneur {

    int idZoo;
    ArrayList<Terrestre> listTerrestre = new ArrayList<>();

    public Cage(ArrayList<Terrestre> listTerrestre, int idZoo) {
        this.listTerrestre = listTerrestre;
        this.idZoo = idZoo;
    }

    public void goCage() {
        for (Terrestre item: this.listTerrestre) {
            System.out.println(item.marcher() + " dans ma cage.");
        }
    }
}
