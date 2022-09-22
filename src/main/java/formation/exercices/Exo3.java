package formation.exercices;

import java.util.Scanner;

public class Exo3 {

    public void Profit() {
        Scanner in = new Scanner(System.in);

        System.out.println("Indiquez ici le prix de fabrication :");
        int userInputFacto = in.nextInt();

        System.out.println("Indiquez ici le prix de vente :");
        int userInputSell = in.nextInt();

        if (userInputFacto > userInputSell) {
            int losses = userInputFacto - userInputSell;
            System.out.println("Perte de " + losses + " €");
        } else if (userInputFacto == userInputSell) {
            System.out.println("Ni pertes, ni profits !");
        } else {
            int earnings = userInputSell - userInputFacto;
            System.out.println("Profit de " + earnings + " €");
        }
    }
}
