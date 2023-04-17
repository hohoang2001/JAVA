package array;

import java.util.Scanner;

public class push_element_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter size array: ");
        int size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("nhập số cần chèn");
        int X = input.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = input.nextInt();
        if (index < 0 && index > arr.length) {
            System.out.println("Bạn Nhập Sai Index");
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = X;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
