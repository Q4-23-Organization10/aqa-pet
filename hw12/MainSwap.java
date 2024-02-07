import java.util.Arrays;
import java.util.List;

public class MainSwap {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 28, 10, 1, 16, 7);
        int x = 15;

        System.out.println("Початкова колекція:");
        System.out.println(numbers);

        int i = 0;
        int j = numbers.size() - 1;

        while (i<=j) {
            if ( numbers.get(i) <= x){
                i++;
            } else  if (numbers.get(j) > x) {
                j --;
            } else {
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
                i++;
                j--;
            }
        }

        System.out.println("Нова колекція:");
        System.out.println(numbers);

    }
}
