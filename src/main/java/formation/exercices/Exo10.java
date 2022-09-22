package formation.exercices;

import java.util.Scanner;

public class Exo10 {

    public void Vpyramide() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        int userInput = sc.nextInt();

        int nbEtoiles = 1;
        String etoile = "*";
        String espace = " ";

        for (int i = 1; i <= userInput+1; i++) {
            System.out.println(espace.repeat(userInput-i) + etoile.repeat(nbEtoiles));
            nbEtoiles = nbEtoiles + 2;
        }
    }
}
