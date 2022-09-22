package Garage;

public class Voiture implements Vehicule {

    String nom;

    public Voiture() {
        this.nom = "Voiture";
    }

    @Override
    public String afficherVehicule() {
        return this.nom;
    }
}
