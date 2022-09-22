package formation.exercices;

import java.util.Scanner;

public class Exo8 {

    public void Escalier() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        int userInput = sc.nextInt();

        String etoiles = "*";

        for (int i = 0; i <= userInput; i++) {
            System.out.println(etoiles.repeat(i));
        }
    }
}
