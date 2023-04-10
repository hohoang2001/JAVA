package Introduction_to_Java;

import java.util.Scanner;

public class first_degree_equation {
    public static void main(String[] args) {
        System.out.printf("Linear Equation Resolver");
        System.out.printf("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner num = new Scanner(System.in);
        System.out.println("a: ");
        double a = num.nextDouble();
        System.out.printf("b: ");
        double b = num.nextDouble();
        System.out.printf("c: ");
        double c = num.nextDouble();
        if(a != 0){
            double result = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", result);
        }
        else {
            if(b ==c ){
                System.out.printf("The solution is all x!");
            }
            else {
                System.out.printf("No solution!");
            }
        }
    }
}
