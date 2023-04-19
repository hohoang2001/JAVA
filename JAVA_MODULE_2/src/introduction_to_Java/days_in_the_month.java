package introduction_to_Java;

import java.util.Scanner;

public class days_in_the_month {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.printf("Which month that you want to count days? ");
        int month = days.nextInt();
        switch (month){
            case 2:
                System.out.printf(" Tháng '"+ month +"' có thể có 28 hoặc 29 ngày ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng '"+ month +"' có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng '"+ month +"' có 30 ngày");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
