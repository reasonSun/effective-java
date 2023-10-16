package chapter8.item52;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "집합";
    }

    public static String classify(List<?> lst) {
        return "리스트";
    }

    public static String classify(Collection<?> c) {
        return "컬렉션";
    }

//    public static String classify(Collection<?> c) {
//        return c instanceof Set ? "집합" :
//                c instanceof List ? "리스트" : "컬렉션";
//    }

    public static void main(String[] args) {
        Collection<?>[] collection = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collection) {
            System.out.println(classify(c));
        }
    }
}
