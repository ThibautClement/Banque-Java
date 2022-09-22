package Banque.Comptes;

import Banque.Interface.Compte;

import java.text.DateFormat;

public class Comptes implements Compte {

    protected int id;
    protected double solde;
    protected DateFormat dateOuverture;

    public Comptes(int id, double solde, DateFormat dateOuverture) {
        this.id = id;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public DateFormat getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(DateFormat dateOuverture) {
        this.dateOuverture = dateOuverture;
    }


    @Override
    public double debiterCompte(int montant) {

        return 0;
    }

    @Override
    public double crediterCompte(int montant) {

        return 0;
    }

    @Override
    public void virementInterne() {

    }

    @Override
    public void virementExterne() {

    }
}
