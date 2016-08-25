/*
 * Created by Steven Jennings (zzApotheosis) on 24 August 2016.
 *
 * Jeez, took me long enough to complete this day. Only a handful of days left
 * before I have officially completed HackerRank's 30 Days of Code!
 */

package day26;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();

        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();

        sc.close();

        int fine = 0;

        if (actualYear < expectedYear) {
            fine = 0;
        } else if (actualYear == expectedYear) {
            if (actualMonth < expectedMonth) {
                fine = 0;
            } else if (actualMonth == expectedMonth){
                if (actualDay <= expectedDay) {
                    fine = 0;
                } else {
                    fine = (actualDay - expectedDay) * 15;
                }
            } else if (actualMonth > expectedMonth) {
                fine = (actualMonth - expectedMonth) * 500;
            }
        } else if (actualYear > expectedYear) {
            fine = 10000;
        }

        System.out.println(fine);
    }
}