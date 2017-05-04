package main;

/**
 * Transportable interface
 */
interface Transportable {
    boolean isTranspotrable();
    Double getAverageSpeed();
    void setAverageSpeed(Double averageSpeed);
    Integer getCountWheels();
    void setCountWheels(Integer countWheels);
    Integer getPassengerCapacity();
    void setPassengerCapacity(Integer passengerCapacity);
    Double getCarryingCapacity();
    void setCarryingCapacity(Double carryingCapacity);
    Integer getMaxPassengerCapacity();
    void setMaxPassengerCapacity(Integer maxPassengerCapacity);
    Double getMaxCarryingCapacity();
    void setMaxCarryingCapacity(Double maxCarryingCapacity);
}
