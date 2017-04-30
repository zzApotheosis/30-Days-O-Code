/*
 * Created by Steven Jennings (zzApotheosis) on 01 July 2016.
 */

package day25;

import java.util.Scanner;

public class Solution0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        int test;
        int counter;

        for (int i = 0; i < in; i++) {
            counter = 0;
            test = scan.nextInt();

            for (int j = 1; j <= test; j++){
                if (test % j == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}