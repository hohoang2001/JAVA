import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner input = new Scanner(System.in);
        int key;
        for (int element:list) {
            System.out.print(element + " ");
        }
        System.out.println("Nhập phần tử bạn muốn tìm: ");
        key = input.nextInt();
        int result = serch(list,key);
        if (result >= 0){
            System.out.println("Phần tử " + key + " có trong mảng" + " Ở vị trí index " + result);
        }
        else {
            System.out.println("Phần tử không có trong mảng");
        }

    }



    static int serch(int[] list, int key) {
        int low = 0;
        int height = list.length - 1;
        while (height >= low) {
            int mid = (low + height) / 2;
            if (key < list[mid]) {
                height = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

