package formation.exercices;

import java.util.Objects;
import java.util.Scanner;

public class Exo6 {

    public void Calculatrice() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un opérateur de type (+, -, *, /) :");
        String userOperator = sc.nextLine();

        do {
            if (!Objects.equals(userOperator, "+") && !Objects.equals(userOperator, "-") && !Objects.equals(userOperator, "*") && !Objects.equals(userOperator, "/")) {
                System.out.println("Ceci n'est pas un opérateur.");
                userOperator = sc.nextLine();
            }
        } while (!Objects.equals(userOperator, "+") && !Objects.equals(userOperator, "-") && !Objects.equals(userOperator, "*") && !Objects.equals(userOperator, "/"));

        System.out.println("Entrer le premier opérande :");
        int userInput1 = sc.nextInt();

        System.out.println("Entrer le second opérande :");
        int userInput2 = sc.nextInt();

        int result = 0;

        if (Objects.equals(userOperator, "+")) {
            result = userInput1 + userInput2;
        } else if (Objects.equals(userOperator, "-")) {
            result = userInput1 - userInput2;
        } else if (Objects.equals(userOperator, "*")) {
            result = userInput1 * userInput2;
        } else if (Objects.equals(userOperator, "/")) {
            result = userInput1 / userInput2;
        }

        System.out.println(userInput1 + " " + userOperator + " " + userInput2 + " = " + result);
    }
}
