/**
 * Created by Steven Jennings (zzApotheosis) on 05 June 2016.
 *
 * Integers cannot exceed the maximum value (2^31), so the biggest input without any errors is 12,
 * because 12! < 2^31 and 13! > 2^31.
 */

package day9;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stdin = sc.nextInt();
        sc.close();
        int stdout = factorial(stdin);
        System.out.println(stdout);
    }

    public static int factorial(int num) {
        if (num <= 1) {
//            System.out.println("Reached Base Case"); //Debug info
            return 1;
        } else {
//            System.out.println("Current num = " + num); //Debug info
            return num * factorial(num - 1);
        }
    }
}