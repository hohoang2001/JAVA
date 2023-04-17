package array;

import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        int[] array2;
        System.out.println("Nhập kích thước mảng 1");
        int size = input.nextInt();
        array1 = new int[size];
        int index1 = 0;
        while (index1 < array1.length) {
            System.out.println("Nhập element" + (index1 + 1) + ":");
            array1[index1] = input.nextInt();
            index1++;
        }
        System.out.println("Nhập kích thước mảng 2");
        int size1 = input.nextInt();
        array2 = new int[size];
        int index2 = 0;
        while (index2 < array2.length) {
            System.out.println("Nhập element" + (index2 + 1) + ":");
            array2[index2] = input.nextInt();
            index2++;
        }
        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element : array2) {
            System.out.print(element + " ");
        }
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        System.out.println("");
        for (int element : array3) {
            System.out.print(element + " ");

        }
    }
}
