package Beans;

import Interface.Pilotable;

public class Simulateur implements Pilotable {
    protected Boolean trainAtterrissage;
    protected long puissance;
    protected long altitude;
    protected long angleVolets;
    protected long positionManche;
    
    public long getPuissance() {
        return this.puissance;
    }
    
    public void setPuissance(long puissanceCible) {
        this.puissance = puissanceCible;
    }

    public long getAltitude() {
        return altitude;
    }

    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }

    public void sortirTrainAtterrissage() {
        this.trainAtterrissage = false;
    }

    public void rentrerTrainAtterrissage() {
        this.trainAtterrissage = true;
    }

    public void inclinerVolets(long angle) {
        this.angleVolets = angle;
    }

    public void setPositionManche(long position) {
        this.positionManche = position;
    }

    @Override
    public void blabla() {

    }
}
