package Banque.Interface;

public interface Conseiller extends Client {

    public void ouvertureCompte();
    public void fermetureCompte();
    public void ajoutClient();
    public void supprClient();
    public void modifClient();

    @Override
    void retrait(int montant);

    @Override
    void versement(int montant);

    @Override
    void affichageSolde(int idCompte);

    @Override
    void virement();

}
