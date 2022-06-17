package task1;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(30));
        }
        arrayList.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        System.out.println(arrayList.stream().distinct().toList());
        System.out.println(arrayList.stream().filter(integer -> integer % 2 == 0).filter(integer -> integer >= 7 && integer <= 17).toList());
        System.out.println(arrayList.stream().map(integer -> integer * 2).toList());
        System.out.println(arrayList.stream().sorted().limit(4).toList());
        System.out.println(arrayList.stream().count());
        System.out.println(arrayList.stream().mapToDouble(value -> value.doubleValue()).average().getAsDouble());
    }
}
