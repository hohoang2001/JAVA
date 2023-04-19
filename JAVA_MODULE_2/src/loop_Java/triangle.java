package loop_Java;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int choise = -1;
        while (choise != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Nhập Chiều Rộng: ");
                    int with = input.nextInt();
                    System.out.println("Nhập Chiều Cao: ");
                    int height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < with; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int choisece = -1;
                    while (choisece != 0) {
                        System.out.println("1. Print the square triangle: top-left");
                        System.out.println("2. Print the square triangle: top-right");
                        System.out.println("3. Print the square triangle: bottom-left");
                        System.out.println("4. Print the square triangle: bottom-right");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice: ");
                        choisece = input.nextInt();
                        switch (choisece) {
                            case 1:
                                System.out.println("Nhập chiều dài cạnh góc vuông: ");
                                int lenght1 = input.nextInt();
                                for (int i = 0; i < lenght1; i++) {
                                    for (int j = lenght1 - i; j > 0; j--) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Nhập chiều dài cạnh góc vuông: ");
                                int lenght2 = input.nextInt();
                                String cach = " ";
                                for (int i = 0; i < lenght2; i++) {
                                    for (int j = lenght2 - i; j > 0; j--) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                    System.out.print(cach);
                                    cach += " ";
                                }
                                break;
                            case 3:
                                System.out.println("Nhập chiều dài cạnh góc vuông: ");
                                int lenght3 = input.nextInt();

                                for (int i = 0; i < lenght3; i++) {
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                System.out.println("Nhập chiều dài cạnh góc vuông: ");
                                String cach1 = "* ";
                                int lenght4 = input.nextInt();
                                for (int i = 0; i < lenght4; i++){
                                    for (int j = lenght4 -1; j > 0; j--){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                    System.out.print(cach1);
                                    cach1 += "* ";
                                }
                                break;
                            case 5:
                                choisece = 0;
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều dài cạnh tam giác cân: ");
                    int choiseses = input.nextInt();
                    for (int i = 0; i < choiseses; i++){
                        for (int j = 0 ; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = choiseses; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }


    }
}
