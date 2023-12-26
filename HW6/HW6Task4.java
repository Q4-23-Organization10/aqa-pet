import java.util.Scanner;

public class HW6Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть довжину першої сторони: ");
        double sideT1 = scanner.nextDouble();

        System.out.print("Введіть довжину другої сторони: ");
        double sideT2 = scanner.nextDouble();

        System.out.print("Введіть довжину третьої сторони: ");
        double sideT3 = scanner.nextDouble();

        if ( sideT1 < 0 || sideT2 < 0 || sideT3 < 0){
            System.out.println("Довжина сторони не може бути від'ємною");
        } else {
            if ((sideT1 == sideT2 && sideT2 != sideT3) || (sideT1 == sideT3 && sideT3 != sideT2) || (sideT2 == sideT3 && sideT3 != sideT1)) {
                System.out.println("Трикутник - рівнобедрений");
            } else {
                System.out.println("Трикутник - не рівнобедрений");
            }
        }
        scanner.close();
    }
}
