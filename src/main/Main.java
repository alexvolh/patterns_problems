package main;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vaz = new Car(4, 60d, 2, 180d);
        System.out.println(printShippingTime(TransportServant.shippingTime(vaz, 80.5d), "vaz"));
        System.out.println(printTotalShippingCoast(TransportServant.totalShippingCost(vaz,11.4d,5.2d,80.5d), "vaz"));

        System.out.println();

        Vehicle zaz = new Car(4, 45d, 3, 400d);
        System.out.println(printShippingTime(TransportServant.shippingTime(zaz, 230.5d), "zaz"));
        System.out.println(printTotalShippingCoast(TransportServant.totalShippingCost(zaz,5.7d,2.5d,230.5d), "zaz"));

        System.out.println();

        Vehicle jeep = new Car(4, 100d, 4, 890d, 4, 1200d);
        System.out.println(printShippingTime(TransportServant.shippingTime(jeep, 260d), "jeep"));
        System.out.println(printTotalShippingCoast(TransportServant.totalShippingCost(jeep,19.9d,12.5d,260d), "jeep"));
        System.out.println(" is car trailer: " + ((Car) jeep).isCarTrailer());

        System.out.println();

        Vehicle bicycle = new Bicycle(2, 20d, 1, 30d);
        System.out.println(printShippingTime(TransportServant.shippingTime(bicycle, 50d), "bicycle"));
        System.out.println(printTotalShippingCoast(TransportServant.totalShippingCost(bicycle,2.25d,1.5d,50d), "bicycle"));

        System.out.println();

        Vehicle cart = new Cart(4, 1, 820d);
        System.out.println(printShippingTime(TransportServant.shippingTime(cart, 100d), "cart"));
        System.out.println(printTotalShippingCoast(TransportServant.totalShippingCost(cart,1.78d,0.72d,50d), "cart"));
    }
    private static String printShippingTime(Double shippingTime, String name) {
        return shippingTime.intValue() > 0 ? "\"" + name + "\" time of transportation: " + String.valueOf(shippingTime.intValue()) + " hour" : "\"" + name + "\"" + "is not transporting ";
    }
    private static String printTotalShippingCoast(Double totalShippingCost, String name) {
        return totalShippingCost.intValue() > 0 ? "\"" + name + "\" total shipping cost: " + String.valueOf(totalShippingCost.intValue()) + " UAH" : "\"" + name + "\"" + "is not transporting ";
    }
}


