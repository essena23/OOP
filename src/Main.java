public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Bicycle bicycle = new Bicycle("Орленок ", 2);
        serviceStation.check(bicycle);
        Car car = new Car("Opel Corsa", 4);
        serviceStation.check(car);
        Truck truck = new Truck("Volvo", 8);
        serviceStation.check(truck);

    }
}