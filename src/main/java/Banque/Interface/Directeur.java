package Banque.Interface;

public interface Directeur extends Conseiller{

    public void ajoutAgence();
    public void supprAgence();
    public void modifAgence();
    public void ajoutConseiller();
    public void supprConseiller();
    public void modifConseiller();

    @Override
    void ouvertureCompte();

    @Override
    void fermetureCompte();

    @Override
    void ajoutClient();

    @Override
    void supprClient();

    @Override
    void modifClient();

    @Override
    void retrait(int montant);

    @Override
    void versement(int montant);

    @Override
    void affichageSolde(int idCompte);

    @Override
    void virement();
}
