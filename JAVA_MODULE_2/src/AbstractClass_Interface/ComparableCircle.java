package AbstractClass_Interface;
import inheritance.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public int compareTo(ComparableCircle o){
        if(getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) {
            return -1;
        }
        else return 1;
    }


}
