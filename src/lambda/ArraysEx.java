package lambda;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.setAll(arr, i -> (int) (Math.random()*5)+1);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
