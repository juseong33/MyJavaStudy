package sec02.exam04;

public class DriverExample2 {
    public static void main(String[] args) {
        Driver2 driver2 = new Driver2();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver2.drive(bus);
        driver2.drive(taxi);
    }
}
