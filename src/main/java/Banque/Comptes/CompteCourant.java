package Banque.Comptes;

import java.text.DateFormat;

public class CompteCourant extends Comptes {

    protected double autoDevouvert;

    public CompteCourant(int id, double solde, DateFormat dateOuverture, double autoDevouvert) {
        super(id, solde, dateOuverture);
        this.autoDevouvert = autoDevouvert;
    }

    public double getAutoDevouvert() {
        return autoDevouvert;
    }

    public void setAutoDevouvert(double autoDevouvert) {
        this.autoDevouvert = autoDevouvert;
    }
}
