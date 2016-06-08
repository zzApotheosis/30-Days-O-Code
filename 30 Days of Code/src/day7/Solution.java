/**
 * Created by Steven Jennings (zzApotheosis) on 6/3/2016.
 */

package day7;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] array = getArray();
        printReverseArray(array);
    }

    public static int[] getArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
