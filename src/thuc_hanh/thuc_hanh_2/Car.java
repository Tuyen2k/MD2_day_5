package thuc_hanh.thuc_hanh_2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;


    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void display() {
        System.out.println("Hello World!");
    }
}
