/*
 * Created by Steven Jennings (zzApotheosis) on 12 June 2016.
 *
 * Compared to day 15, this was a breeze. So much easier to understand exceptions than Linked Lists!
 *
 * And on a side note, for anyone reading this, I bought a Blue Yeti microphone.
 * Amazing mic!
 *
 * All right, so apparently HackerRank didn't like the single import java.util.Scanner
 * so just leave the default imports that it gives you. This source code will include
 * the default imports... Could be a HackerRank bug?
 */

package day16;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        try {
            Integer.parseInt(S);
            System.out.println(S);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}