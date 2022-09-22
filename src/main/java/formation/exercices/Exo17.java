package formation.exercices;

import java.util.*;

public class Exo17 {

    public void Pendu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un mot à trouver :");
        String wordToFind = sc.nextLine();

        String[] wordToFindSplit = wordToFind.split("");
        ArrayList<String> wordToFindList = new ArrayList<String>(Arrays.asList(wordToFindSplit));

        System.out.println("Entrer un nombre de vies :");
        int nbVies = sc.nextInt();

        List<String> motCache = new ArrayList<String>();
        for (int i = 0; i < wordToFind.length(); i++) {
            motCache.add("_");
        }

        System.out.println("Entrer une lettre :");
        String letterAsk = sc.nextLine();
        boolean isWin = false;
        boolean isFound = false;

        while (!isWin) {
            for (int i = 0; i < wordToFindList.size(); i++) {
                if (Objects.equals(wordToFindList.get(i), letterAsk)) {
                    motCache.set(i, letterAsk);
                    isFound = true;
                }
            }
            if (!isFound) {
                nbVies--;
            }
            System.out.println("Il vous reste " + nbVies + " vie(s)");
            String motCachejoin = motCache.toString();
            if (wordToFind.equals(motCachejoin)) {
                isWin = true;
                System.out.println("Bravo, c'est gagné !");
            }
            letterAsk = sc.nextLine();
        }
    }
}

