package sec02.exam01;

public class CarExample2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }
}
