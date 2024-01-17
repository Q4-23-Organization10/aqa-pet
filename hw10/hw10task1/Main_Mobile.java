package hw10task1;

public class Main_Mobile {
    public static void main(String[] args) {
        MobilePhone[] mobilePhones  = new MobilePhone[2];
        mobilePhones [0] = new Model("black", "Samsung", "S23");
        mobilePhones [1] = new Model("white", "Apple", "14");

        for (MobilePhone mobilePhone : mobilePhones ){
            mobilePhone.sendMessages();
            mobilePhone.call();
            System.out.println(mobilePhone.toString());

        }
    }
}
