package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        String message = "Bonjour agent ";
        int number = 24;
        String number2 = "23";

        // cast
        int result = number + parseInt(number2);

        //console
        System.out.println(message + result);

        // tableaux
        int[] tableau = new int[5];
        tableau[0] = 4;
        tableau[1] = 45;
        tableau[2] = 54;
        tableau[4] = 78;

        System.out.println(Arrays.toString(tableau));

        // double[] tableau1 = new double[5];
        // tableau1[0] = 4;
        // tableau1[2] = 45;
        // tableau1[4] = 78;

        //listes
        List<String> maListe = new ArrayList<String>(Arrays.asList("demo", "why not", "fait chaud"));

        // ajout d'une valeur
        maListe.add("test");
        System.out.println(maListe);

        // for pour liste
        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }

        // for pour array
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        // foreach
        for (String item: maListe
             ) {
            System.out.println(item);
        }

        // while
        int i = 0;
        while (i < tableau.length) {
            System.out.println(tableau[i]);
            i++;
        }

        i = 0;
        // while sur liste
        while (i < maListe.size()) {
            System.out.println(maListe.get(i));
            i++;
        }

        // do-while
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<11);

        for (double item: tableau) {
            if (item == 45) continue;
            if (item == 77) break;
            System.out.println(item);
        }
    }
}
