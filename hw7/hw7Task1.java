import java.util.Scanner;

public class hw7Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть слово: ");
        String input = scanner.nextLine();


        char[] charArray1 = input.toCharArray();
        char[] charArray2 = new char[charArray1.length];

        for (int i = 0; i < charArray1.length; i++) {
            charArray2[i] = charArray1[charArray1.length - 1 - i];
        }


        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                System.out.println("Рядок не є паліндромом");
                break;
            } else {
                System.out.println("Рядок є паліндромом");
                break;
            }
        }

        scanner.close();
    }
}
