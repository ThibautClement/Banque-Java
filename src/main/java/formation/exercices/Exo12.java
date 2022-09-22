package formation.exercices;

import java.util.*;

public class Exo12 {

    public void Temperature() {
        List<Integer> listeTemp = new ArrayList<Integer>(Arrays.asList(3, 12, -3, 5, 18, 11495));

        int tempTest = listeTemp.get(0);

        for (int item: listeTemp) {
            if (Math.abs(item) < Math.abs(tempTest)) {
                tempTest = item;
            } else if (Math.abs(item) == Math.abs(tempTest) && item <0) {
                tempTest = item;
            }
        }
        System.out.println(listeTemp);
        System.out.println("La température la plus proche de 0°C est : " + tempTest);
    }
}
