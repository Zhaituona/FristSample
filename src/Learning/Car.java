package Learning;

public class Car {
    int price = 5000;
    String make = "Toyota";
    String model = "Matrix";
    boolean madeInJapan;
    public Car(int price ){
        this.price = 5000;

    }
    public Car(String make, String model){
        this.make = "Toyota";
        this.model = "Matrix";
    }
    public Car(String make,String model,int price){
        this.make = make;
        this.model = model;
        this.price =price;
        System.out.println("this is about the car" + make + model + price );
    }
    public void getCarPrice(){
        System.out.println(price);
    }
    public void getCarModel(){
        System.out.println(model);
    }
}
// add one line
// 4+5 = 9