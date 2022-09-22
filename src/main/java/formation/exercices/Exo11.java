package formation.exercices;

import java.util.Scanner;

public class Exo11 {

    public void Monnaie() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        double userInput = sc.nextDouble();

        double [] monnaie = new double[15];
        monnaie[0] = 500;
        monnaie[1] = 200;
        monnaie[2] = 100;
        monnaie[3] = 50;
        monnaie[4] = 20;
        monnaie[5] = 10;
        monnaie[6] = 5;
        monnaie[7] = 2;
        monnaie[8] = 1;
        monnaie[9] = 0.5;
        monnaie[10] = 0.2;
        monnaie[11] = 0.1;
        monnaie[12] = 0.05;
        monnaie[13] = 0.02;
        monnaie[14] = 0.01;

        double rest1 = userInput;
        double rest2 = userInput;

        for (int i = 0; i < monnaie.length; i++) {
            double cpt = 0;
            rest1 = (rest1 % monnaie[i]);
            cpt = ((rest2-rest1)/monnaie[i]);
            rest2 = (rest1 % monnaie[i]);
            System.out.println("Billets de " + monnaie[i] + "€ : " + Math.round(cpt));
        }
    }
}
