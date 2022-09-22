package Banque.Statuts;

import Banque.Comptes.CompteCourant;
import Banque.Comptes.Comptes;

import java.util.ArrayList;

public class Client implements Banque.Interface.Client {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String telephone;
    protected String email;

    ArrayList<Comptes> listComptes = new ArrayList<>();

    public Client(int id, String nom, String prenom, String telephone, String email, ArrayList<Comptes> listComptes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.listComptes = listComptes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Comptes> getListComptes() {
        return listComptes;
    }

    public void setListComptes(ArrayList<Comptes> listComptes) {
        this.listComptes = listComptes;
    }

    @Override
    public void retrait(int montant, int idCompte) {

    }

    @Override
    public void versement(int montant, int idCompte) {

    }

    @Override
    public void affichageSolde(int idCompte) {

    }

    @Override
    public void virement() {

    }
}
