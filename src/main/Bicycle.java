package main;

/**
 *
 */
public class Bicycle extends Vehicle {
    {
        setMaxPassengerCapacity(1);
        setMaxCarryingCapacity(65.2d);
    }
    Bicycle(Integer countWheels, Double averageSpeed, Integer passengerCapacity, Double carryingCapacity) {
        super(countWheels, averageSpeed, passengerCapacity, carryingCapacity);
    }

    @Override
    public boolean isTranspotrable() {
        return getPassengerCapacity() == 1 & !(getCarryingCapacity() > getMaxCarryingCapacity());
    }
}
