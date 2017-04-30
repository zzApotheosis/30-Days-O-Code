/*
 * Created by Steven Jennings (zzApotheosis) on 13 June 2016.
 *
 * Pretty easy day. The only hiccup I had was in the if statement in the Calculator class.
 * I threw the Exception, but I couldn't figure out how to make it print the message to console.
 * Turns out, I just had to write the string in the Exception's parentheses, like so:
 * throw new Exception("n and p should be non-negative");
 */

package day17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T --> 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n,p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}