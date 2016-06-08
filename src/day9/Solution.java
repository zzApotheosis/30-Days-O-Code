package day9;

import java.util.Scanner;

/**
 * Created by Steven Jennings (zzApotheosis) on 6/5/2016.
 */

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
//            System.out.println("Reached Base Case"); Debug info
            return 1;
        } else {
//            System.out.println("Current num = " + num); Debug info
            return num * factorial(num - 1);
        }
    }
}