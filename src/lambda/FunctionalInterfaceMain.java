package lambda;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        f.max(1, 2);

        MyFunction f2 = (a, b) -> a > b ? a : b;

        f2.max(1, 2);

        int max = max(1, 2, f2);
        System.out.println("max = " + max);

    }

    private static int max(int a, int b, MyFunction f){
        return f.max(a, b);
    }
}
