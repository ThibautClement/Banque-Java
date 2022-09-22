package Beans.models;

public class Conseiller extends Personne {
    protected int matriculeC;

    public Conseiller(String nom, String prenom, int age, String adresse, int tel, int matriculeC) {
        super(nom, prenom, age, adresse, tel);
        this.matriculeC = matriculeC;
    }

    @Override
    public String toString() {
        return  "nom = '" + nom + '\'' +
                ", prenom = '" + prenom + '\'' +
                ", age = " + age +
                ", adresse = '" + adresse + '\'' +
                ", tel = " + tel + '\'' +
                "matriculeC = " + matriculeC;
    }

    public int getMatricule() {
        return matriculeC;
    }

    public void setMatricule(int matriculeC) {
        this.matriculeC = matriculeC;
    }


}
