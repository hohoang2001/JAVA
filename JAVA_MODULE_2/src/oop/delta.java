package oop;

public class delta {
    private double a,b,c;
    double delta;
    public delta(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        delta = b * b - 4 * a * c;
        return delta;
    }
    public double getroot1() {
        return (-b + Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / (a*2);
    }
    public double getroot2() {
        return (-b - Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / (a*2);
    }
}
