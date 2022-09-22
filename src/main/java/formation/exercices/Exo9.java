package formation.exercices;

import java.util.Scanner;

public class Exo9 {

    public void Dpyramide() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        int userInput = sc.nextInt();

        String etoiles = "*";

        for (int i = 0; i <= userInput; i++) {
            System.out.println(etoiles.repeat(i));
        }

        for (int i = userInput-1; i > 0; i--) {
            System.out.println(etoiles.repeat(i));
        }

    }
}
