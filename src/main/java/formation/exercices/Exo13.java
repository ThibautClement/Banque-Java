package formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exo13 {

    public void Tri() {

        List<Integer> listeTri = new ArrayList<Integer>(Arrays.asList(12, 25, 5, 7, 6, -5));

        Collections.sort(listeTri);
        System.out.println(listeTri);
    }
}
