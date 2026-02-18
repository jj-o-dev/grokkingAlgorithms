package chapter01;

public class App {
    public static void main(String[] args) {
        int[] lista = new int[] {1, 2, 3, 6, 9};
        System.out.println(binarySearch(lista, 1));
    }

    public static int binarySearch(int[] vetor, int item) {
        int init = 0;
        int end = vetor.length - 1;
        int mid, guess;
        
        while (init <= end) {
            mid = (init + end) / 2;
            guess = vetor[mid];
            if (guess == item) {
                return mid;
            }
            if (item > guess) {
                init = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
