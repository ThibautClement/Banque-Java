package Interface;

public interface Pilotable extends Pepe {

    static final int ALTITUDE_SECURITE = 100;
    long getPuissance();
    void setPuissance(long puissanceCible);
    long getAltitude();
    void rentrerTrainAtterrissage();
    void sortirTrainAtterrissage();
    void inclinerVolets(long angle);
    void setPositionManche(long position);
}
