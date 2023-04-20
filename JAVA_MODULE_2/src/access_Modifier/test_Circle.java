package access_Modifier;

public class test_Circle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " +  circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " +  circle2.getArea());
    }
}
