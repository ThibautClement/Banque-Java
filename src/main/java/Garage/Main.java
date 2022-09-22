package Garage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Voiture voiture = new Voiture();
        Moto moto = new Moto();
        Camion camion = new Camion();

        ArrayList<Vehicule> listVehicule = new ArrayList<>(Arrays.asList(voiture, moto, camion));

        Garage garage = new Garage(listVehicule);

        garage.garage();
    }
}
