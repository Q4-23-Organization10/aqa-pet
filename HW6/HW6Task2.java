import java.util.Scanner;

public class HW6Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця: ");
        int month1 = scanner.nextInt();


        if (month1 == 1) {
            System.out.println("JAN");
        } else if (month1 == 2) {
            System.out.println("FEB");
        } else if (month1 == 3) {
            System.out.println("MAR");
        } else if (month1 == 4) {
            System.out.println("APR");
        } else if (month1 == 5) {
            System.out.println("MAY");
        } else if (month1 == 6) {
            System.out.println("JUN");
        } else if (month1 == 7) {
            System.out.println("JUL");
        } else if (month1 == 8) {
            System.out.println("AUG");
        } else if (month1 == 9) {
            System.out.println("SEP");
        } else if (month1 == 10) {
            System.out.println("OCT");
        } else if (month1 == 11) {
            System.out.println("NOV");
        } else if (month1 == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }

        System.out.print("Введіть номер місяця: ");
        int month2 = scanner.nextInt();


        switch (month2) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }
        scanner.close();
    }
}
