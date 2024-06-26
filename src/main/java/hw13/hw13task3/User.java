package hw13.hw13task3;

public class User {
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age + '\n';
    }

}
