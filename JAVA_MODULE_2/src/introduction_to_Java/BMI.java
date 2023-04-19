package introduction_to_Java;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, bmi, weight;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số kilogam: ");
        weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.printf("%f \n%s", bmi, "Còn mỗi bộ xương 😵😵😵😵😵😵😵😵😵😵😵😵😵😵");
        else if (bmi < 25.0)
            System.out.printf("%f \n %s", bmi, "Quá Ngon mlem mlem 🤤🤤🤤🤤🤤🤤🤤🤤🤤🤤🤤🤤🤤");
        else if (bmi < 30.0)
            System.out.printf("%f  \n%s", bmi, "Thừa Cân Rồi Bạn êii 🫠🫠🫠🫠🫠🫠🫠🫠🫠🫠🫠🫠");
        else
            System.out.printf("%f \n %s", bmi, "Mập Quá Bạn Êiiiiiii 🥲🥲🥲🥲🥲🥲🥲🥲🥲🥲🥲🥲");
    }
}
