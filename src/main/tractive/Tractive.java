package main.tractive;

/**
 * тяговая сила
 */
public interface Tractive {
    Integer getMaxTransportingWeight();
    Integer getAverageSpeed();
    void going();
}
