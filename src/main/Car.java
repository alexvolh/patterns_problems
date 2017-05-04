package main;

/**
 *
 */
class Car extends Vehicle {
    private Trailer carTrailer = null;
    private boolean isCarTrailer = false;

    Car(Integer countWheels, Double averageSpeed, Integer passengerCapacity, Double carryingCapacity) {
        super(countWheels, averageSpeed, passengerCapacity, carryingCapacity);
        setMaxPassengerCapacity(4);
        setMaxCarryingCapacity(550.5d);
    }

    Car(Integer countWheels, Double averageSpeed, Integer passengerCapacity, Double carryingCapacity, Integer maxPassengerCapacity, Double maxCarryingCapacity) {
        super(countWheels, averageSpeed, passengerCapacity, carryingCapacity, maxPassengerCapacity, maxCarryingCapacity);
        carTrailer = null;
    }

    public Trailer getCarTrailer() {
        return carTrailer;
    }

    public void setCarTrailer(Trailer carTrailer) {
        this.carTrailer = carTrailer;
    }

    public boolean isCarTrailer() {
        return isCarTrailer;
    }

    @Override
    public boolean isTranspotrable() {
        Double middleWeightPassenger = 80d; //с учетом среднего веса на 1-го пассажира
        if ((getCarryingCapacity() + getMaxPassengerCapacity() * middleWeightPassenger <= getMaxCarryingCapacity()) & !(getPassengerCapacity() > getMaxPassengerCapacity())) {
            return true;
        } else if (getCarryingCapacity() + (getMaxPassengerCapacity() * middleWeightPassenger) > getMaxCarryingCapacity()) {
            // Lazy initialisation
            //Добавить прицеп к машине, если перевес существует и не превышает максимум грузоподъемности самого прицепа
            if (Math.abs(getMaxCarryingCapacity() - (getCarryingCapacity() + (getMaxPassengerCapacity() * middleWeightPassenger))) <= Trailer.MAX_CARRYING_CAPACITY) {
//              System.out.println("add trailer to car: ");
                carTrailer = new Trailer(2d, 5d, 1.65d, "AL-KO", "triangular", "yellow");
                isCarTrailer = true;
                return true;
            } else {
//                System.out.println("too much weight !");
                return false;
            }
        }

        return false;
    }
}
