package oop;

public class perimeter {
    double width,height;
    public perimeter(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) / 2;
    }
    public String Display(){
        return "Rectangle: " + " độ dài " + width + " chiều cao: " + height + "}";
    }
}
