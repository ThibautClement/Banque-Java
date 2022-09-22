package formation.exercices;

import java.util.Scanner;

public class Exo4 {

    public void Bigger() {

        Scanner in = new Scanner(System.in);
        int userInput1 = in.nextInt();
        int userInput2 = in.nextInt();
        int userInput3 = in.nextInt();

        int max;

        if (userInput1 > userInput2) {
            max = userInput1;
        } else {
            max = userInput2;
        }

        if (userInput3 > max) {
            max = userInput3;
        }

        System.out.println("Le plus grand nombre est : " + max);

    }
}
