package capitulo04;

import java.util.Arrays;

public class ContagemRecursiva {
    public static void main(String[] args) {
        System.out.println(contagem(new int[]{1, 2, 3, 4, 7, -1, 0, -23}));// 8
    }

    private static int contagem(int[] n) {
        if (n.length == 0) {
            return 0;
        }
        return 1 + contagem(Arrays.copyOfRange(n, 1, n.length));
    }
}
