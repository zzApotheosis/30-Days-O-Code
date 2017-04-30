/*
 * Created by Steven Jennings (zzApotheosis) on 08 June 2016.
 *
 * I actually thought this was going to be a rather difficult day in the challenge, but it's not.
 * Kathryn Hodge's YouTube tutorial series is really making a difference in my experience with Java.
 * https://www.youtube.com/watch?v=wlA66hZ4Z74
 *
 * All of this code was provided by HackerRank or written by me. No other resources were used.
 */

package day12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}