package Zoo;

import Zoo.Abstract.Conteneur;
import Zoo.Interfaces.Aquatique;
import Zoo.Interfaces.Terrestre;
import Zoo.Interfaces.Volatile;
import Zoo.Models.Animaux.Aigle;
import Zoo.Models.Animaux.Chat;
import Zoo.Models.Animaux.Dauphin;
import Zoo.Models.Animaux.MartinPecheur;
import Zoo.Models.Bati.Aquarium;
import Zoo.Models.Bati.Cage;
import Zoo.Models.Bati.Voliere;
import Zoo.Models.Bati.Zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conteneur> listEnclos = new ArrayList<>();

        Zoo ValerLand = new Zoo(0, listEnclos);

        Aigle ValeriAigle = new Aigle();
        Chat ValerChatian = new Chat();
        Dauphin Dauphinrian = new Dauphin();
        MartinPecheur ValerianPecheur = new MartinPecheur();

        ArrayList<Terrestre> listAnimauxTerrestre = new ArrayList<>(Arrays.asList(ValerChatian));
        ArrayList<Volatile> listAnimauxVolatile = new ArrayList<>(Arrays.asList(ValeriAigle, ValerianPecheur));
        ArrayList<Aquatique> listAnimauxAquatique = new ArrayList<>(Arrays.asList(Dauphinrian, ValerianPecheur));

        Cage cage = new Cage(listAnimauxTerrestre, ValerLand.id);
        Voliere voliere = new Voliere(listAnimauxVolatile, ValerLand.id);
        Aquarium aquarium = new Aquarium(listAnimauxAquatique, ValerLand.id);

        cage.goCage();
        voliere.goVol();
        aquarium.goAqua();

    }
}
