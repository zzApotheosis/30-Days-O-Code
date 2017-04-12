/*
 * Created by Steven Jennings (zzApotheosis) on 10 April 2017.
 *
 * Actually, this wasn't created by me. Once again, this was written by GitHub user xeoneux:
 * https://github.com/xeoneux/30-Days-of-Code/tree/master/Z%20-%20Bitwise%20AND
 *
 * This was an amazing 30 days of code. I learned so much about computer science that I otherwise
 * wouldn't have learned (very well, anyway). These last few days were a little weird, but most
 * of the important stuff was done earlier. I'll keep my work as the prize I earned as a result
 * of taking on HackerRank's 30 Days of Code.
 */

package day29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();

            int max = 0;

            for (int j = 1; j < N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    int h = j & k;
                    if (h < K && max < h) max = h;
                }
            }

            System.out.println(max);
        }
    }
}