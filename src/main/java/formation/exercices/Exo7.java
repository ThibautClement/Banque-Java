package formation.exercices;

import java.util.Scanner;

public class Exo7 {

    public void Somme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        int userInput = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < userInput+1; i++) {
            sum = sum+i;
        }
        System.out.println("La somme de tous les nombres compris entre 1 et " + userInput + " est égal à " + sum);
    }
}
