package array;

import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        int[] arr;


        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập kích thước của mảng");
            size = input.nextInt();
            if (size > 40){
                System.out.println("Kích thước mảng không được vượt quá 40");
            }
        }
        while (size > 40);
        arr = new int[size];
        int index = 0;
        while (index < arr.length){
            System.out.print("Enter element" + (index + 1) + ": ");
            arr[index] = input.nextInt();
            index++;
        }
        int indexs =minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[indexs]);

    }
    public static int minValue(int[] Array){
        int index = 0;
        for(int i = 1; i < Array.length; i++){
            if(Array[i] < Array[index]){
                index = i;
            }
        }
        return index;
    }
}
