package capitulo03;

public class FatorialRecursivo2 {
    public static void main(String[] args) {
        System.out.println(factWithTail(5, 1));
    }

    /* Na prática não faz diferença implementar uma função recursiva com cauda
       no Java, já que a linguagem não suporta TCO (Tail Call Optimization)
    */
    private static int factWithTail(int n, int acc) {
        if (n == 1) {
            return acc;
        }
        return factWithTail(n - 1, n * acc);
    }
}
