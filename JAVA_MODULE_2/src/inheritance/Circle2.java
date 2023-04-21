package inheritance;

public class Circle2 {
    private double radius;
    private String color;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "radius= " + radius +
                ", color= " + color
                + ", Area= " + getArea();
    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(2.0, "green");
        System.out.println(circle2.toString());
    }
}
