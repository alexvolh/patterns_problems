package main;

/**
 * Vehicle abstract class
 */
abstract class Vehicle implements Transportable {
    private Integer countWheels;
    private Double averageSpeed;
    private Integer passengerCapacity;
    private Double carryingCapacity;
    private Integer maxPassengerCapacity;
    private Double maxCarryingCapacity;

    public Vehicle(Integer countWheels, Integer passengerCapacity, Double carryingCapacity) {
        this.countWheels = countWheels;
        this.passengerCapacity = passengerCapacity;
        this.carryingCapacity = carryingCapacity;
    }

    public Vehicle(Integer countWheels, Double averageSpeed, Integer passengerCapacity, Double carryingCapacity) {
        this.countWheels = countWheels;
        this.averageSpeed = averageSpeed;
        this.passengerCapacity = passengerCapacity;
        this.carryingCapacity = carryingCapacity;
    }

    public Vehicle(Integer countWheels, Double averageSpeed, Integer passengerCapacity, Double carryingCapacity, Integer maxPassengerCapacity, Double maxCarryingCapacity) {
        this.countWheels = countWheels;
        this.averageSpeed = averageSpeed;
        this.passengerCapacity = passengerCapacity;
        this.carryingCapacity = carryingCapacity;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.maxCarryingCapacity = maxCarryingCapacity;
    }

    @Override
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Integer getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(Integer countWheels) {
        this.countWheels = countWheels;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Integer getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(Integer maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public Double getMaxCarryingCapacity() {
        return maxCarryingCapacity;
    }

    public void setMaxCarryingCapacity(Double maxCarryingCapacity) {
        this.maxCarryingCapacity = maxCarryingCapacity;
    }
}
