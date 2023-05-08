package inheritance;

import AbstractClass_Interface.Colorable;
import AbstractClass_Interface.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setlenght(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[side=" + side + "]";
    }

    @Override
    public void resize(double percent) {
        double newSide = side * (1 + percent / 100);
        setSide(newSide);
    }


    @Override
    public void howtoColor() {
        System.out.println(" Color all four sides");
    }
    public void abc(){
        System.out.println("1");
    }
}
