import java.util.Scanner;

public class HW6Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double absNum1 = Math.abs(num1);
        double absNum2 = Math.abs(num2);


        if (absNum1 > absNum2) {
            System.out.println(num1 + " має більше абсолютне значення");
        } else if (absNum1 < absNum2) {
            System.out.println(num2 + " має більше абсолютне значення");
        } else {
            System.out.println("Абсолютні значення обох чисел рівні");
        }

        scanner.close();
    }
}
