package Banque.Statuts;

import Banque.Comptes.Comptes;

import java.util.ArrayList;

public class Directeur extends Conseiller implements Banque.Interface.Directeur {

    ArrayList<Conseiller> listConseiller = new ArrayList<>();

    public Directeur(int id, String nom, String prenom, String telephone, String email, ArrayList<Comptes> listComptes, String login, String password, ArrayList<Client> listClients, ArrayList<Conseiller> listConseiller) {
        super(id, nom, prenom, telephone, email, listComptes, login, password, listClients);
        this.listConseiller = listConseiller;
    }

    public ArrayList<Conseiller> getListConseiller() {
        return listConseiller;
    }

    public void setListConseiller(ArrayList<Conseiller> listConseiller) {
        this.listConseiller = listConseiller;
    }


    @Override
    public void ajoutAgence() {

    }

    @Override
    public void supprAgence() {

    }

    @Override
    public void modifAgence() {

    }

    @Override
    public void ajoutConseiller() {

    }

    @Override
    public void supprConseiller() {

    }

    @Override
    public void modifConseiller() {

    }

    @Override
    public void retrait(int montant) {

    }

    @Override
    public void versement(int montant) {

    }
}
