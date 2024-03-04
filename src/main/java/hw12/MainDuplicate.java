package main.java.hw12;

import java.util.*;

public class MainDuplicate {
    public static void main(String[] args) {
        List<Integer> origList = generRandomList(100, -20, 20);
        Set<Integer> set = new HashSet<>(origList);
        List<Integer> newlist = new ArrayList<>();
        newlist.addAll(set);

        int duplicCount = origList.size() - set.size();

        System.out.println("Початкова колекція:");
        System.out.println(origList);
        System.out.println("Колекція без дублікатів:");
        System.out.println(set);
        System.out.println("Кількість видалених дублікатів: " + duplicCount);
    }

        public static List<Integer> generRandomList (int size, int min, int max) {
            Random random = new Random();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(max - min + 1) + min);
            }
            return list;
        }

}
