package com.arturo;

/**
 * Creating an implementation of the Quicksort algorithm based on the book:
 * Introduction to Algorithms (Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein)
 */
public class Quicksort {

    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, Integer p, Integer r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quicksort(arr, p, q-1);
            quicksort(arr, q + 1, r);
        }
    }

    private static int partition(int[] arr, Integer p, Integer r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (arr[j] <= x) {
                i++;
                exchange(arr, i, j);
            }
        }
        i++;
        exchange(arr, i, r);
        return i;
    }

    private static void exchange(int[] arr, Integer i, Integer j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }
}
