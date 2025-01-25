package lambda;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        boolean condition = condition("str", s -> s.equals("str"));
        System.out.println("condition = " + condition);
    }

    static boolean condition(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }
}
