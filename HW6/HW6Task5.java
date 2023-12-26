import java.util.Scanner;

public class HW6Task5 {
    public static void main(String[] args) {
        // Створення об'єкта Scanner для зчитування введеного користувачем рядка
        Scanner scanner = new Scanner(System.in);

        // Зчитування рядка від користувача
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        int length = input.length();

        if (length > 2 && length % 2 ==0){
            int middleStr = length / 2;
            System.out.println("Два середні символи: " + input.substring(middleStr - 1, middleStr +1) );
        } else {
            System.out.println("Строка не парна");
        }
        scanner.close();
    }

}
