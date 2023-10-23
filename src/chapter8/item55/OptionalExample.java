package chapter8.item55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty())
            throw new IllegalArgumentException("빈 컬렉션");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }

    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        if(c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return Optional.of(result);
    }

    public static <E extends Comparable<E>> Optional<E> max3(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        System.out.println(max(numbers));
        List<Integer> numbers2 = new ArrayList<>();
        System.out.println(max2(numbers2));
        System.out.println(max3(numbers2));

        System.out.println(max3(numbers2).orElse(999));
    }
}
