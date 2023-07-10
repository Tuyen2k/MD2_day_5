package bai_tap.bai_tap_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(10);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        circle.display();

        System.out.println("Radius1: " + circle1.getRadius());
        System.out.println("Area2: " + circle1.getArea());
        circle1.display();

    }
}
