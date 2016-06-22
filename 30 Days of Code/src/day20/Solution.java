/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 *
 * This was a pretty fun day. I didn't even watch Kathryn Hodge's YouTube tutorial.
 * I just winged it based on what I already know about Java and this is what I came up with.
 * It's a pretty simple single-file solution with a main method and a swap method.
 * The challenge on HackerRank basically gave me the answer anyway with its
 * Bubble Sort sample code.
 */

package day20;

import java.util.Scanner;

public class Solution {

    private static int[] array;
    private static int numberOfSwaps = 0;

    public static void main(String[] args) {
        getInfo();
        sortArray();
        printInfo();
    }

    private static void getInfo() {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        array = new int[arraySize];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
    }

    private static void sortArray() {
        while (true) {
            int counter = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array[i], array[i + 1], i);
                    numberOfSwaps++;
                    counter++;
                }
            }

            if (counter == 0) {
                break;
            }
        }
    }

    private static void swap(int val1, int val2, int index) {
        array[index] = val2;
        array[index + 1] = val1;
    }

    private static void printInfo() {
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }
}