package array;

import java.util.Scanner;

public class find_value {
    public static void main(String[] args) {
        String[] Student = {"Long", "Thái", "Phượng", "Thắng"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String input_name = input.nextLine();
        boolean isname = false;
        for (int i =0; i < Student.length; i++){
            if(Student[i].equals(input_name)){
                System.out.println("Tên của học sinh là: " + input_name + " ở vị trí  " + i);
                isname = true;
                break;
            }

        }
        if (isname == false){
            System.out.println("Tên: " + input_name + " Không có trong danh sách");
        }


    }
}
