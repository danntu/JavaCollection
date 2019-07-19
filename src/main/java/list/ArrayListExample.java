package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,89,3,4,5,6,7,8));

        numbers.add(200);
        numbers.add(201);
        numbers.stream().forEach(System.out::println);
        System.out.println();
        numbers.set(9,300);
        numbers.stream().forEach(System.out::println);
        System.out.println();
        numbers.remove(0);
        numbers.stream().forEach(System.out::println);

        System.out.println("Iterator");
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
