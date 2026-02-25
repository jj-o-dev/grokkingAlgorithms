package capitulo04;

import java.util.Arrays;

public class SomaRecursiva {
    public static void main(String[] args) {
        System.out.println(soma(new int[]{1, 2, 3, 4}));// 10
    }

    private static int soma(int[] n) {
        if (n.length == 0) {
            return 0;
        }
        return n[0] + soma(Arrays.copyOfRange(n, 1, n.length));// esse method eu não conhecia
    }
}
