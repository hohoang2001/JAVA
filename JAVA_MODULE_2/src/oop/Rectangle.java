package oop;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Độ Dài");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều Cao");
        double height = scanner.nextDouble();
        perimeter perimeter = new perimeter(width,height);
        System.out.println("Hình chữ nhật của bạn: " + perimeter.Display());
        System.out.println("Chu vi hình chữ nhật là: " + perimeter.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + perimeter.getArea());
    }
}
