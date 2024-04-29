package collections.set.ex1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); // Java는 한 번만 저장
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set.iterator(); // 반복자 얻기

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        size = set.size();
        System.out.println("총 객체 수: " + size);

        for (String element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
