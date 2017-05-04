package main.tractive;

/**
 *
 */
public class Bull implements Tractive {
    @Override
    public Integer getMaxTransportingWeight() {
        return 1200;
    }

    @Override
    public Integer getAverageSpeed() {
        return 15;
    }

    @Override
    public void going() {
        System.out.println("bull is going: ");
    }
}
