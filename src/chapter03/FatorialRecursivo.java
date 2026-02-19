package chapter03;

public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int n) {// recursão sem cauda
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
