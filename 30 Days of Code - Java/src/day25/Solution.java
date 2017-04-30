/*
 * Created by Steven Jennings (zzApotheosis) on 01 July 2016.
 *
 * Original code by GitHub user reneargento.
 * https://github.com/reneargento/hacker-rank-30-days-of-code/blob/master/Java%20Solutions/Day25.java
 *
 * Obviously, I know how to find if a number is prime or not. My code was not optimized at all
 * and I was too lazy to try to optimize it, so my good friend whom I have never met
 * on GitHub has helped me out once more. I'll check out the optimization for this sometime later.
 *
 * Side note: My code worked on all the test cases except for case 7 and 8, where
 * the input integers were way too large for the HackerRank compiler to handle with the code I wrote.
 */

package day25;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int next;
        boolean isPrime;

        for (int i = 0; i < total; i++) {
            next = scanner.nextInt();

            if (next <= 1) {
                System.out.println("Not prime");
            } else {
                isPrime = true;

                for (int j = 2; j < Math.sqrt(next); j++) {
                    if (next % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }
        scanner.close();
    }
}
