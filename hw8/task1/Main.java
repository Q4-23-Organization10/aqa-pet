package task1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            User user1 = new User("Fred", "54321test");
            user1.setAge(25);
            user1.setEmail("Fred@gmail.com");

            System.out.println("Введіть суму покупки користувача:" + user1.userName);
            double purchasePrice1 = scanner.nextDouble();
            user1.makePurchase(purchasePrice1);
            System.out.println("Введіть суму покупки користувача:" + user1.userName);
            double purchasePrice2 = scanner.nextDouble();
            user1.makePurchase(purchasePrice2);
            user1.printTotalAmountOfSpentMoney();


            User user2 = new User("Tom", "test1234");
            user1.setAge(40);
            user1.setEmail("Tom@gmail.com");

            System.out.println("Введіть суму покупки користувача:" + user2.userName);
            double purchasePrice3 = scanner.nextDouble();
            user2.makePurchase(purchasePrice3);
            System.out.println("Введіть суму покупки користувача:" + user2.userName);
            double purchasePrice4 = scanner.nextDouble();
            user2.makePurchase(purchasePrice4);
            user2.printTotalAmountOfSpentMoney();
        }
    }

