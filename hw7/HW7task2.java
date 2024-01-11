public class HW7task2 {
    public static void main(String[] args) {

        int [] array = {6, -8, 0, -2, 9, 8, 155, 579};

        int min = array[0];
        int max = array[0];

        for (int j : array) {
            if (min > j) {
                min = j;
            } else if (max < j) {
                max = j;
            }
        }
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
    }
}
