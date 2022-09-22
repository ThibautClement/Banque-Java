package Garage;

public class Camion implements Vehicule{

    String nom;

    public Camion() {
        this.nom = "Camion";
    }

    @Override
    public String afficherVehicule() {
        return this.nom;
    }
}
