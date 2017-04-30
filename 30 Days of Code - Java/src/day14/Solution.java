/*
 * Created by Steven Jennings (zzApotheosis) on 10 June 2016.
 *
 * Simple enough. I kind of figured out the scope of variables and such
 * in the previous days of this challenge. Earlier, I figured out that
 * methods in a class can use variables defined under the class. Likewise,
 * I figured out that these "properties" can be accessed by class name as well.
 *
 * For example,
 *
 * Difference D = new Difference(a); where a is an integer array.
 * D.maximumDifference is the value of maximumDifference in the class Difference.
 *
 * Java is amazing! End nerd rant.
 */

package day14;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
//            System.out.println("Index of array: " + i); //Debug info
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.println(D.maximumDifference);
    }
}