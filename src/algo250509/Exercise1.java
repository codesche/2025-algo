package algo250509;

// 자율 실습

class Car {
    private int time;
    private int distance;

    Car() {
    }

    Car(int time, int distance) {
        this.time = time;
        this.distance = distance;
    }

    public int velocity(int time, int distance) {
        return distance / time;
    }

}

public class Exercise1 {
    public static void main(String[] args) {
        Car car = new Car();
        int velocity = car.velocity(5, 100);
        System.out.println(velocity);           // 속도 = 거리 / 시간
    }
}
