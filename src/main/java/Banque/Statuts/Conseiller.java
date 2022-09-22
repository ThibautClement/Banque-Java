package Banque.Statuts;

import Banque.Comptes.Comptes;

import java.util.ArrayList;

public class Conseiller extends Client implements Banque.Interface.Conseiller {

    protected String login;
    protected String password;

    ArrayList<Client> listClients = new ArrayList<>();

    public Conseiller(int id, String nom, String prenom, String telephone, String email, ArrayList<Comptes> listComptes, String login, String password, ArrayList<Client> listClients) {
        super(id, nom, prenom, telephone, email, listComptes);
        this.login = login;
        this.password = password;
        this.listClients = listClients;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Client> getListClients() {
        return listClients;
    }

    public void setListClients(ArrayList<Client> listClients) {
        this.listClients = listClients;
    }

    @Override
    public void ouvertureCompte() {
        
    }

    @Override
    public void fermetureCompte() {

    }

    @Override
    public void ajoutClient() {

    }

    @Override
    public void supprClient() {

    }

    @Override
    public void modifClient() {

    }

    @Override
    public void retrait(int montant) {

    }

    @Override
    public void versement(int montant) {

    }
}
