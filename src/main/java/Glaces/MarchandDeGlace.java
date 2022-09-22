package Glaces;

import java.util.ArrayList;

public class MarchandDeGlace {

    ArrayList<Glaces> listGlaces = new ArrayList<>();

    public MarchandDeGlace(ArrayList<Glaces> listGlaces) {
        this.listGlaces = listGlaces;
    }

    public void marchandDeGlace() {
        for (Glaces item: this.listGlaces) {
            System.out.println(item.manger());
        }
    }
}
