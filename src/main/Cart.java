package main;

import main.tractive.Tractive;

/**
 *
 */
public class Cart extends Vehicle {
    private Tractive tractivePower;
    private Double capacityWithPassanger;

    public Cart(Integer countWheels, Integer passengerCapacity, Double carryingCapacity) {
        super(countWheels, passengerCapacity, carryingCapacity);
        capacityWithPassanger = passengerCapacity * 80d + carryingCapacity;
    }

    public Tractive getTractivePower() {
        return tractivePower;
    }

    public void setTractivePower(Tractive tractivePower) {
        this.tractivePower = tractivePower;
    }

    public Double getCapacityWithPassanger() {
        return capacityWithPassanger;
    }

    public void setCapacityWithPassanger(Double capacityWithPassanger) {
        this.capacityWithPassanger = capacityWithPassanger;
    }

    @Override
    public boolean isTranspotrable() {
        if (capacityWithPassanger.intValue() <= 400) {
            tractivePower = TractiveFactory.getTractive("DONKEY");
            assert tractivePower != null;
            setAverageSpeed(tractivePower.getAverageSpeed().doubleValue());
            return true;
        } else if (capacityWithPassanger.intValue() > 400 &  capacityWithPassanger.intValue() <= 800) {
            tractivePower = TractiveFactory.getTractive("HORSE");
            assert  tractivePower != null;
            setAverageSpeed(tractivePower.getAverageSpeed().doubleValue());
            return true;
        } else if (capacityWithPassanger.intValue() > 800 &  capacityWithPassanger.intValue() <= 1200) {
            tractivePower = TractiveFactory.getTractive("BULL");
            assert  tractivePower != null;
            setAverageSpeed(tractivePower.getAverageSpeed().doubleValue());
            return true;
        }
        return false;
    }
}
