/*
 * Created by Steven Jennings (zzApotheosis) on 01 June 2016.
 *
 * This program prints the first 10 multiples of your input integer.
 */

package day05;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        output(N);
    }

    public static void output(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}
