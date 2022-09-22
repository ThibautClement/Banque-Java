package formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo16 {

    public void RollerCoaster() {

        int profit = 0;
        int tours = 3;

        List<Integer> file = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));

        for (int i = 0; i < tours; i++) {
            int places = 5;
            List<Integer> gpDansManege = new ArrayList<Integer>();
            while (!file.isEmpty() && file.get(0) <= places) {
                places -= file.get(0);
                profit += file.get(0);
                gpDansManege.add(file.get(0));
                file.remove(file.get(0));
            }
            file = new ArrayList<>(gpDansManege);
            gpDansManege.removeAll(file);
            gpDansManege.removeAll(file);
        }
        System.out.println("Profits --> " + profit + "€");
    }
}
