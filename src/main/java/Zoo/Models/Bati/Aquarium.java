package Zoo.Models.Bati;

import Zoo.Abstract.Conteneur;
import Zoo.Interfaces.Aquatique;
import java.util.ArrayList;

public class Aquarium extends Conteneur {
    int idZoo;

    ArrayList<Aquatique> listAquatique = new ArrayList<>();

    public Aquarium(ArrayList<Aquatique> listAquatique, int idZoo) {
        this.listAquatique = listAquatique;
        this.idZoo = idZoo;
    }

    public void goAqua() {
        for (Aquatique item: this.listAquatique) {
            System.out.println(item.nager() + " dans mon aquarium.");
        }
    }
}
