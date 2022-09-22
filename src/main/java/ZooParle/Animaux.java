package ZooParle;

public class Animaux {
    String nom;
    String cri;

    public Animaux(String nom, String cri) {
        this.nom = nom;
        this.cri = cri;
    }

    public String parler() {
        return cri;
    }
}
