package collections;

import java.util.ArrayList;
import java.util.List;

public class Lesson01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(4);numbers.add(6);numbers.add(21);numbers.add(83);numbers.add(52);numbers.add(62);numbers.add(98);

        numbers.stream().map(n -> n * 2).forEach(System.out::println);
    }
}
