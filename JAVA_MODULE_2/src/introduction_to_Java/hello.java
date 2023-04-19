package introduction_to_Java;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = hello.nextLine();
        System.out.printf("Hello " + name);
    }
}
