package main.java.hw13.hw13task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main_User {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User("Stefan", "Tomson", 20));
        users.add(new User("Alice", "Curt", 30));
        users.add(new User("Bob", "Brown", 23));
        users.add(new User("Sara", "Adams", 35));
        users.add(new User("John", "Parker", 28));
        users.add(new User("Emily", "Davis", 16));
        users.add(new User("Sam", "Scot", 40));
        users.add(new User("Mila", "Anderson", 19));
        users.add(new User("David", "Taylor", 18));
        users.add(new User("Olivia", "Tomson", 17));

        List<User> sortAge = users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
        System.out.println("Сортування за віком:");
        System.out.println(sortAge);


        double averageAge = users.stream().mapToInt(User::getAge).average().orElse(0);
        System.out.println("Середній вік:" + averageAge);

        List<User> sortNameAge = users.stream().sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge)).toList();
        System.out.println("Сортування Імʼя та вік:");
        System.out.println(sortNameAge);

        List<User>  hasUserWithSA = users.stream().filter(user -> user.getFirstName().startsWith("S") || user.getFirstName().startsWith("A")).toList();
        if (!hasUserWithSA.isEmpty()){
            System.out.println("Користувачі с літерами S та A: ");
            System.out.println(hasUserWithSA);
        } else {
            System.out.println("Немає користувачів с літерами S та A ");
        }

        List<User> usersNo18 = users.stream().filter(user -> user.getAge() < 18).toList();

        if (!usersNo18.isEmpty()) {
            System.out.println("Користувачі молодше 18:");
            System.out.println(usersNo18);
        } else {
            System.out.println("Усі користувачі старше 18");
        }

    }
}
