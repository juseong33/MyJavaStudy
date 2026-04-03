package sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus2();

        vehicle.run();

        Bus2 bus = (Bus2) vehicle;

        bus.run();
        bus.checkFate();
    }
}
