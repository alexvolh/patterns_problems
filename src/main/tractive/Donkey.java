package main.tractive;

/**
 *
 */
public class Donkey implements Tractive {

    @Override
    public Integer getMaxTransportingWeight() {
        return 400;
    }

    @Override
    public Integer getAverageSpeed() {
        return 30;
    }

    @Override
    public void going() {
        System.out.println("donkey is going: ");
    }
}
