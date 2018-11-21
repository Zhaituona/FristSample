package Learning;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car(5000);
        Car youCar = new Car("Toyota","Matrix");
        Car herCar = new Car(4000);
        Car momCar = new Car("BMW","X6");
        Car oldCar = new Car("Lexus","RX350",32000);
        myCar.getCarPrice();
        myCar.getCarModel();
        youCar.getCarModel();


    }
}
