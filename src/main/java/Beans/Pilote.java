package Beans;

import Interface.Pilotable;

public class Pilote {

    public void faireDecoler(Pilotable pilo) {
        pilo.setPuissance(2000);
        System.out.println(pilo.getPuissance());
    }
}
