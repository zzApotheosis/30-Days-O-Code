/**
 * Created by Steven Jennings (zzApotheosis) on 5/29/2016.
 */

package day1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;

        /* Read and save an integer, double, and String to your variables.*/
        a = scan.nextInt();
        b = scan.nextDouble();
        c = scan.next();
        c += scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + a);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + b);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + c);

        scan.close();
    }
}