package oop;

public class Fan {
    public static int a = 0;
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getspeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public boolean geton() {
        return on;
    }

    public void seton(boolean on) {
        this.on = on;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public String toString() {
        this.a = 4;
        if (on) {
            return "Speed: " + speed + " Color: " + color + " Radius: " + radius + " Fan is on ";
        }
        else {
            return "Color: " + color + "Radius: " + radius + " Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setspeed(3);
        Fan1.setradius(10);
        Fan1.setcolor("Yellow");
        Fan1.seton(true);




        Fan Fan2 = new Fan();
        Fan2.setspeed(2);
        Fan2.setradius(5);
        Fan2.setcolor("Blue");
        Fan2.seton(false);


        System.out.println("Fan 1: " + Fan1.toString());
        System.out.println("Fan 2: " + Fan2.toString());


    }
}
