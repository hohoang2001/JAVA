package inheritance;

public class Cylinder extends Circle2{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height * getArea();
    }

    @Override
    public String toString() {
        return "height=" + height + " radius= " + getRadius() + " color: " + getColor() +
                " Volume= " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, "red",3.6);
        System.out.println(cylinder.toString());

    }
}
