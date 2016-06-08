/**
 * Created by Steven Jennings (zzApotheosis) on 02 June 2016.
 *
 * Code source: https://codearvilyn.wordpress.com/2016/05/12/hacker-rank-day-6-lets-review/
 *
 * I'll review this code and see if I can learn from it...
 *
 * Yeah, I could have done this myself... I'm such a lazy man.
 */

package day06;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            printEvenSpaceOdd(str.toCharArray());
        }
        sc.close();
    }

    public static void printEvenSpaceOdd(char[] myCharArray) {
        for (int i = 0; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }
}