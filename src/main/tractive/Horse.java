package main.tractive;

/**
 *
 */
public class Horse implements Tractive {
    @Override
    public Integer getMaxTransportingWeight() {
        return 800;
    }

    @Override
    public Integer getAverageSpeed() {
        return 25;
    }

    @Override
    public void going() {
        System.out.println("horse is going: ");
    }
}
