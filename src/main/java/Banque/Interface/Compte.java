package Banque.Interface;

public interface Compte {

    public double debiterCompte(int montant);
    public double crediterCompte(int montant);
    public void virementInterne();
    public void virementExterne();

}
