package Garage;

public class Moto implements Vehicule{

    String nom;

    public Moto() {
        this.nom = "Moto";
    }

    @Override
    public String afficherVehicule() {
        return this.nom;
    }
}
