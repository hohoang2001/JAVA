package oop;

import java.util.Scanner;

public class delta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        delta discr = new delta(a,b,c);
        double delta = discr.getDiscriminant();
        if (delta > 0){
            System.out.println("phương trình có 2 nghiệm: "+ " Nghiệm 1: " + discr.getroot1() + " Nghiệm 2: " + discr.getroot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm do 2 nghiệm bằng nhau" + discr.getroot1());
        } else {
            System.out.println("Phương trình không có gốc");
        }
    }
}
