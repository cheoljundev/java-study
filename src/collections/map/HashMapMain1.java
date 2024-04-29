package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("신용권", 95);
        map.put("홍길동", 90);
        map.put("동장군", 75);
        map.put("홍길동", 100); // 키가 같으면 마지막 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t홍길동 : " + map.get("홍길동")); // 키로 값 찾기
        System.out.println();

        // 객체 하나씩 처리
        Set<String> keySet = map.keySet(); // keySey 얻기
        // 반복해서 키를 얻고 값을 Map에서 알아냄
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
        // 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
