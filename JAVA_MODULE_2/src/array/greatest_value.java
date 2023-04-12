package array;

import java.util.Scanner;

public class greatest_value {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mảng: ");
            size = input.nextInt();
            if(size > 20){
                System.out.println("kích thuước mảng quá 20");
            }

        }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){

            System.out.println("element" + (i + 1)+ " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for( int j =0; j < array.length; j++){
            if(array[j] > max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là:  " + max + " ở vị trí thứ " + index);
    }
}
