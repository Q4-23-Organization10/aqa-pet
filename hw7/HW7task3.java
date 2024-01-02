public class HW7task3 {
    public static void main(String[] args) {

        int [] array = {63, -82, 11, -2, 99, 8, 155, 579, 76};


        for (int i = 0; i < array.length; i++) {
            if ( array [i] % 2 == 0)
                array [i] = 0;

            System.out.println(array [i]);
        }
    }
}
