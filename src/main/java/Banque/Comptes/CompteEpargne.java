package Banque.Comptes;

import java.text.DateFormat;

public class CompteEpargne extends Comptes {

    protected int tauxEpargne;
    protected double plafond;

    public CompteEpargne(int id, double solde, DateFormat dateOuverture, int tauxEpargne, double plafond) {
        super(id, solde, dateOuverture);
        this.tauxEpargne = tauxEpargne;
        this.plafond = plafond;
    }

    public int getTauxEpargne() {
        return tauxEpargne;
    }

    public void setTauxEpargne(int tauxEpargne) {
        this.tauxEpargne = tauxEpargne;
    }

    public double getPlafond() {
        return plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }
}
