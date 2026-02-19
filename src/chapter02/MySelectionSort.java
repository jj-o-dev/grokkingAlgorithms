package chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySelectionSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 9, 3, 4, 2, 7));

        System.out.println(selectionSort(array));
    }

    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list.size());

        int size = list.size();
        for (int i = 0; i < size; i++) {
            int small = findSmall(list);
            newList.add(list.get(small));
            list.remove(small);
        }
        return newList;
    }

    public static int findSmall(List<Integer> list) {
        int small = list.getFirst();
        int smallIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < small) {
                small = list.get(i);
                smallIndex = i;
            }
        }
        return smallIndex;
    }
}
