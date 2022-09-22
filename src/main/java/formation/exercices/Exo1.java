package formation.exercices;

import java.util.Scanner;

public class Exo1 {

    public void Bienvenue() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        System.out.println("Bienvenue " + userInput);
    }
}
