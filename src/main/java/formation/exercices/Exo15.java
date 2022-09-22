package formation.exercices;

import java.util.Scanner;

public class Exo15 {

    public void JustePrix() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de tentative :");
        int userLife = sc.nextInt();

        System.out.println("Entrer le nombre maximale de l'intervalle :");
        int userMax = sc.nextInt();

        double random = Math.floor(Math.random() * (userMax - 1 + 1)) + 1;

        System.out.println("Entrer un nombre entier pour jouer :");
        int userAttempt = sc.nextInt();

        while (userLife >= 0) {
            if (userAttempt > random) {
                System.out.println("C'est moins!");
                userLife--;
                System.out.println("Il vous reste " + userLife + " vie(s).");
                userAttempt = sc.nextInt();
            } else if (userAttempt < random) {
                System.out.println("C'est plus!");
                userLife--;
                System.out.println("Il vous reste " + userLife + " vie(s).");
                userAttempt = sc.nextInt();
            } else if (userAttempt == random) {
                System.out.println("Vous avez gagné !!");
                break;
            } else {
                userLife--;
                System.out.println("Vous avez perdu !!");
            }
        }
    }
}
