package loop_Java;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money = input.nextDouble();
        System.out.println("nhập số tháng gửi");
        month = input.nextInt();
        System.out.println("nhập lãi xuất");
        interestRate = input.nextDouble();
        double totalinterestRate = 0;
        for (int i = 0; i < month; i++) {
            totalinterestRate += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền lãi " + totalinterestRate);
    }
}
