package sec02.exam03;

public class Bus2 implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFate() {
        System.out.println("승차요금을 체크합니다.");
    }
}
