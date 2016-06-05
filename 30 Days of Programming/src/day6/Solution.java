package day6;

/**
 * Created by zzapo on 6/2/2016.
 *
 * Code source: https://codearvilyn.wordpress.com/2016/05/12/hacker-rank-day-6-lets-review/
 *
 * I'll review this code and see if I can learn from it...
 */

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            printEvenSpaceOdd(str.toCharArray());
        }

//        String[] word = new String[T];
//        for (int i = 0; i < T; i++) {
//            word[i] = sc.nextLine();
//        }
//                                                              My pathetic code lol
//        for (int i = 0; i < T; i++) {
//            char array[] = word[i].toCharArray();
//        }

//        System.out.println("T is " + T);
//        System.out.println("word[0] is " + word[0]);
//        System.out.println("word[1] is " + word[1]);

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