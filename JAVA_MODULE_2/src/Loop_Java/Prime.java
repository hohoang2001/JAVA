package Loop_Java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = prime.nextInt();
        if (number < 2) {
            System.out.println(number + "is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + "  is a prime");

            else
                System.out.println(number + "  is not a prime");

        }
    }
}