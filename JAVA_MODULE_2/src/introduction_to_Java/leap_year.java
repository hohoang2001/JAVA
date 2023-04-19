package introduction_to_Java;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = leap.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("Năm'" + year + "' là năm nhuận");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.printf("Năm'" + year + "'Năm Không Nhuận");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.printf("Năm '" + year + "' Là năm nhuận");
        } else {
            System.out.printf("Năm'" + year + "' Năm Không Nhuận");
        }
    }
}
