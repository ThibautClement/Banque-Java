package Banque.Interface;

public interface Client {

    public void retrait(int montant, int idCompte);

    public void versement(int montant, int idCompte);

    public void affichageSolde(int idCompte);

    public void virement();

}
