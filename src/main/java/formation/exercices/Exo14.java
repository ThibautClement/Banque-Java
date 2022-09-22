package formation.exercices;

import java.util.Scanner;

public class Exo14 {

    public void FizzBuzz() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre entier :");
        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz!" + i);
            } else if (i%5 == 0) {
                System.out.println("Buzz!" + i);
            } else if (i%3 == 0) {
                System.out.println("Fizz!" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
