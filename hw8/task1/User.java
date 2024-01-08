package task1;

public class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        }
    }

    public String getEmail() {
        return password;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Покупка на суму " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума витрачених грошей: " + amountSpentMoney);
    }

}
