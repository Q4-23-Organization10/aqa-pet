import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
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

        sortAge(users);
        averageAge(users);
        sortNameAge(users);
        usersWithSA(users);
        usersYoungerThan18(users);
    }

    public static List<User> sortAge(List<User> users) {
        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Сортування за віком:");
        System.out.println(sortedByAge);
        return sortedByAge;
    }

    public static double averageAge(List<User> users) {
        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Середній вік:" + averageAge);
        return averageAge;
    }

    public static List<User> sortNameAge(List<User> users) {
        List<User> sortedByNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Сортування Ім'я та вік:");
        System.out.println(sortedByNameAndAge);
        return sortedByNameAndAge;
    }

    public static List<User> usersWithSA(List<User> users) {
        List<User> usersWithSA = users.stream()
                .filter(user -> user.getFirstName().startsWith("S") || user.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
        if (!usersWithSA.isEmpty()) {
            System.out.println("Користувачі з літерами S та A:");
            System.out.println(usersWithSA);
        } else {
            System.out.println("Немає користувачів з літерами S та A");
        }
        return usersWithSA;
    }

    public static List<User> usersYoungerThan18(List<User> users) {
        List<User> usersYoungerThan18 = users.stream()
                .filter(user -> user.getAge() < 18)
                .collect(Collectors.toList());
        if (!usersYoungerThan18.isEmpty()) {
            System.out.println("Користувачі молодше 18 років:");
            System.out.println(usersYoungerThan18);
        } else {
            System.out.println("Усі користувачі старше або дорівнюють 18 рокам");
            return Collections.emptyList();
        }
        return usersYoungerThan18;
    }
}