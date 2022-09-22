package formation.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo0 {

    // constructeur
    public void Exo0() {}

    public void UsersList() {
        Scanner in = new Scanner(System.in);

        // création liste
        List<String> theList = new ArrayList<String>();

        do {
            String userChoice = in.nextLine();
            if (userChoice.length() < 6) {
                theList.add(userChoice);
            } else {
                System.out.println("Votre mot est trop grand !");
            }
        } while (theList.size() < 3);

        System.out.println(theList);
    }
}
