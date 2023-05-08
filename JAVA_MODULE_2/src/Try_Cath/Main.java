package Try_Cath;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập");

        try {
            int b = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException b){
            throw new NumberFormatException("Bị lỗi");
        }
        finally {
            System.out.println("a,b'v");
        }
        System.out.println("a,b,c");
    }
}
