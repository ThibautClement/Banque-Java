package Garage;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicule> listVehicule = new ArrayList<>();

    public Garage(ArrayList<Vehicule> listVehicule) {
        this.listVehicule = listVehicule;
    }

    public void garage() {
        for (Vehicule item: this.listVehicule) {
            System.out.println(item.afficherVehicule());
        }
    }
}
