public class Bai_Tap_L1 {

    public static void main(String[] args) {
        int tong = 0;
        int tich = 1;
        int count = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                tong += array[i];
                tich *= array[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có giá trị");
        } else {
            double evenger = tong / count;
            System.out.println("trung bình là:" + evenger);
            System.out.println("tích là:" + tich);
            System.out.println("tổng là:" + tong);
        }


    }
}
