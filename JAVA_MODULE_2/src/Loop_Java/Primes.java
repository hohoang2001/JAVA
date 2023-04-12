package Loop_Java;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Số Nguyên Tố Cần In Ra: ");
        int Numbers = numbers.nextInt();
        int count = 0;
        int N = 2;
        while (count < Numbers){
            if ( isPrime(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
