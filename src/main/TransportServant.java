package main;

class TransportServant {
    //если груз транспортабельный средством передвижения, тогда вычислить в Servant'е
     static Double shippingTime(Transportable transportable, Double distance) {
        if (transportable.isTranspotrable()) {
            return (distance / transportable.getAverageSpeed()) * 60;
        } else {
            return 0d;
        }
    }
    static Double totalShippingCost(Transportable transportable, Double oneTicketCoast, Double oneKilogramCost, Double distance) {
        if (transportable.isTranspotrable()) {
            return oneTicketCoast * transportable.getPassengerCapacity() + distance * oneKilogramCost;
        } else {
            return 0d;
        }
    }
}
