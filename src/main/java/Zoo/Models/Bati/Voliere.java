package Zoo.Models.Bati;

import Zoo.Abstract.Conteneur;
import Zoo.Interfaces.Volatile;
import java.util.ArrayList;

public class Voliere extends Conteneur {

    int idZoo;
    ArrayList<Volatile> listVolatile = new ArrayList<>();

    public Voliere(ArrayList<Volatile> listVolatile, int idZoo) {
        this.listVolatile = listVolatile;
        this.idZoo = idZoo;
    }

    public void goVol() {
        for (Volatile item: this.listVolatile) {
            System.out.println(item.voler() + " dans ma voliere.");
        }
    }
}
