package formation.exercices;

import java.util.Scanner;

public class Exo5 {

    public void Prof() {
        int max = 20;
        int min = 0;

        int[] notes = new int[16];
        notes[0] = (int)(Math.random() * (max - min) + min);
        notes[1] = (int)(Math.random() * (max - min) + min);
        notes[2] = (int)(Math.random() * (max - min) + min);
        notes[3] = (int)(Math.random() * (max - min) + min);
        notes[4] = (int)(Math.random() * (max - min) + min);
        notes[5] = (int)(Math.random() * (max - min) + min);
        notes[6] = (int)(Math.random() * (max - min) + min);
        notes[7] = (int)(Math.random() * (max - min) + min);
        notes[8] = (int)(Math.random() * (max - min) + min);
        notes[9] = (int)(Math.random() * (max - min) + min);
        notes[10] = (int)(Math.random() * (max - min) + min);
        notes[11] = (int)(Math.random() * (max - min) + min);
        notes[12] = (int)(Math.random() * (max - min) + min);
        notes[13] = (int)(Math.random() * (max - min) + min);
        notes[14] = (int)(Math.random() * (max - min) + min);
        notes[15] = (int)(Math.random() * (max - min) + min);

        for (int note : notes) {
            if (note <= 4) {
                System.out.println(note + "/20 --> Catastrophique, il faut tout revoir");
            } else if (note >= 5 && note <= 10) {
                System.out.println(note + "/20 --> Insuffisant");
            } else if (note >= 11 && note <= 14) {
                System.out.println(note + "/20 --> Peut mieux faire");
            } else if (note >= 15 && note <= 17) {
                System.out.println(note + "/20 --> Bien");
            } else {
                System.out.println(note + "/20 --> Excellent, bon travail");
            }
        }
    }
}
