package Beans.models;

public class Personne {

    protected String nom;
    protected String prenom;
    protected int age;
    protected String adresse;
    protected int tel;

    public Personne(String nom, String prenom, int age, String adresse, int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this. adresse = adresse;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return  "nom = '" + nom + '\'' +
                ", prenom = '" + prenom + '\'' +
                ", age = " + age +
                ", adresse = '" + adresse + '\'' +
                ", tel = " + tel;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
