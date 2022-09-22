package formation.exercices;

import java.util.Scanner;

public class Exo2 {

    public void Addition() {
        Scanner in = new Scanner(System.in);
        int userInput1 = in.nextInt();
        int userInput2 = in.nextInt();

        int result = userInput1 + userInput2;

        System.out.println(userInput1 + " + " + userInput2 + " = " + result);
    }
}
