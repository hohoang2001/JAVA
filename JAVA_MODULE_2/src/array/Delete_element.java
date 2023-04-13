package array;

import java.util.Scanner;

public class Delete_element {
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size element: ");
        int input_arr = input.nextInt();
        arr = new int [input_arr] ;
       int index = 0;
       while (index < arr.length){
           System.out.println(" Nhập element " + (index +1 ) +" : ");
           arr[index] = input.nextInt();
           index++;
       }
        for (int elment:arr) {
            System.out.print(" , element: " + elment);
        }
        System.out.println("");
        System.out.println("Nhập Phần Tử Bạn Muốn xoá:  ");
        int X = input.nextInt();
        int i,index_del;
        for (index_del = i = 0; i < arr.length; i++){
            if (X != arr[i]){
                arr[index_del] = arr[i];
                index_del++;
            }
        }
        for (int l = arr.length -1; l >= index_del; l--){
            arr[l] = 0;
            System.out.println(arr[l]);
        }
        System.out.print("Mảng sau khi xóa là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
