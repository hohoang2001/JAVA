package introduction_to_Java;

import java.util.Scanner;

public class triangle_area {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter width:");
        width = num.nextFloat();
        System.out.println("Enter height:");
        height = num.nextFloat();
        float area = width * height;
        System.out.println("Area:" + area);
    }

}
