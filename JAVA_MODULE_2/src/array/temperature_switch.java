package array;

import java.util.Scanner;

public class temperature_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        double celsius;
        double fahrenheit;
        do {
            System.out.println("Menu.");
            System.out.println("1. đổi độ C sang độ F.");
            System.out.println("2. Đổi dộ F sang độ C.");
            System.out.println("0. Exit.");
            System.out.println("Enter your choice: ");
            value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Kết Quả: " + degres(celsius) + " Độ F");
                    break;
                case 2:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Kết Quả: " + poison(fahrenheit) + " Độ C");
                    break;
                case 0:
                    System.exit(0);
            }

        }
        while (value != 0);


    }
    public static double poison(double degres) {
        double degrees = (5.0 / 9) * (degres - 32);
        return degrees;
    }
    public static double degres (double poison) {
        double celsius = (5.0 / 9) * (poison + 32);
        return celsius;
    }
}
