package Beans;

import Beans.models.Conseiller;
import Beans.models.Directeur;
import Beans.models.Personne;
import Interface.Pilotable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Personne Client = new Personne("Touzard", "Valérian", 22, "Seclin", 0606060606);
//        Conseiller Florian = new Conseiller("Flouquet", "Floriannon", 12, "Bois Blanc", 0606060607, 123456789);
//        Directeur Moi = new Directeur("Clement", "Thibaut", 29, "Gare Lille Flandres", 0644167471, 987654321);
//
//        System.out.println(Client.toString());
//        System.out.println(Florian.toString());
//        System.out.println(Moi.toString());
//
//        System.out.println("Notre directeur monsieur " + Moi.getNom() + " est viré.");
//        Moi.setNom(Client.getNom());
//        System.out.println("Votre nouveau directeur est monsieur " + Moi.getNom() + ".");
//
//        System.out.println("Notre conseiller monsieur " + Florian.getNom() + " est viré.");
//        Florian.setNom("Havez");
//        System.out.println("Votre nouveau conseiller est monsieur " + Florian.getNom() + ".");
//
//        List<Personne> listClients = new ArrayList<Personne>(Arrays.asList(Client, Florian, Moi));
//        System.out.println(listClients);

        Simulateur Simulator = new Simulateur();

        Pilotable bibi = new Simulateur();
        bibi.setPuissance(1500);
        System.out.println(bibi.getPuissance());

        Pilote Jean = new Pilote();
        Jean.faireDecoler(Simulator);


    }
}
