package com.arturo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int listLength = 50;
        int[] arr = new int[listLength];
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            int randomInt = random.nextInt(listLength);
            arr[i]= randomInt;
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (int i : arr) {
            joiner.add(String.valueOf(i));
        }
        System.out.println("Unsorted array");
        System.out.println(joiner.toString());
        long beginningTime = System.currentTimeMillis();
        Quicksort.quicksort(arr);
        long endingTime = System.currentTimeMillis();
        joiner = new StringJoiner(", ");
        for (int i : arr) {
            joiner.add(String.valueOf(i));
        }
        System.out.println("Sorted array");
        System.out.println(joiner.toString());
        System.out.printf("Total time for quicksort: %d ms \n", endingTime - beginningTime);
    }
}
