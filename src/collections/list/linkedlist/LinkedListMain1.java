package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListMain1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP"); // 값 추가
        list.add(2, "Database"); // 해당 인덱스에 값 추가
        list.add("iBATIS");

        int size = list.size(); // 저장된 데이터 수 읽기
        System.out.println("size = " + size);
        System.out.println();

        String skill = list.get(2); // 인덱스의 객체 찾기
        System.out.println("2: " + skill);
        System.out.println();

        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        size = list.size();

        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

    }
}
