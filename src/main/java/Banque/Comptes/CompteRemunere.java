package Banque.Comptes;

import java.text.DateFormat;

public class CompteRemunere extends Comptes{

    protected double soldeDuJour;
    protected int tauxRemunere;

    public CompteRemunere(int id, double solde, DateFormat dateOuverture, double soldeDuJour, int tauxRemunere) {
        super(id, solde, dateOuverture);
        this.soldeDuJour = soldeDuJour;
        this.tauxRemunere = tauxRemunere;
    }

    public double getSoldeDuJour() {
        return soldeDuJour;
    }

    public void setSoldeDuJour(double soldeDuJour) {
        this.soldeDuJour = soldeDuJour;
    }

    public int getTauxRemunere() {
        return tauxRemunere;
    }

    public void setTauxRemunere(int tauxRemunere) {
        this.tauxRemunere = tauxRemunere;
    }

}
