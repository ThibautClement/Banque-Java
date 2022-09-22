package Glaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cornet cornet = new Cornet();
        Granite granite = new Granite();
        Sorbet sorbet = new Sorbet();

        ArrayList<Glaces> listGlaces = new ArrayList<>(Arrays.asList(cornet, granite, sorbet));

        MarchandDeGlace Valerian = new MarchandDeGlace(listGlaces);

        Valerian.marchandDeGlace();
    }

}
