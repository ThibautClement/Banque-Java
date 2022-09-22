package Beans.models;

public class Directeur extends Personne {
    protected int matriculeD;

    public Directeur(String nom, String prenom, int age, String adresse, int tel, int matriculeD) {
        super(nom, prenom, age, adresse, tel);
        this.matriculeD = matriculeD;
    }

    @Override
    public String toString() {
        return
                "nom = '" + nom + '\'' +
                ", prenom = '" + prenom + '\'' +
                ", age = " + age +
                ", adresse = '" + adresse + '\'' +
                ", tel = " + tel + '\'' +
                ", matriculeD = " + matriculeD;
    }

    public int getMatriculeD() {
        return matriculeD;
    }

    public void setMatriculeD(int matriculeD) {
        this.matriculeD = matriculeD;
    }
}
