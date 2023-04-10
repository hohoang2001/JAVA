package BaiTap_Nhom_L1;

import java.sql.SQLOutput;

public class Baitap3 {
  static int count = 0;
    public static void main(String[] args) {
       for (int i = 1; i < 200; i++ ) {
          System.out.print(i + ",");
          if(i % 10 == 0) {
                System.out.println("\n");

          }
        }

    }
}
