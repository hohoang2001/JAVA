package Introduction_to_Java;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        double vietnamdong = 23000;
        double usd;
        Scanner currency = new Scanner(System.in);
        System.out.print("Mời Bạn Nhập USD: ");
        usd = currency.nextDouble();
        double convert = usd * 23000;
        System.out.print("Giá Trị VND: " + convert);

    }
}
