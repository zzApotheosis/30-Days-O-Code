/*
 * Created by Steven Jennings (zzApotheosis) on 06 June 2016.
 *
 * Trying again on June 7, 2016. Solving Day 11 gave me confidence, so I'll try to solve this one too.
 * I'm such a nerd.
 *
 * Looks like I finally did it. And it wasn't even that difficult. I guess I was just lazy on day 10.
 * When I finished, I wondered about negative inputs, but the HackerRank challenge restricted
 * input integers to be between 1 and 1000000. Happy coding.
 */

package day10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        explain();
        Scanner in = new Scanner(System.in);
        int stdin = in.nextInt();
        in.close();
        String binaryIn = convertToBinary(stdin);
//        System.out.println(binaryIn); //Debug info. Uncomment to see binary number of stdin.
        findMaxOnes(binaryIn);
    }

    public static void explain() {
        System.out.println("This program finds the maximum number of consecutive 1s in a binary number.");
        System.out.println("The user inputs an integer. That integer is converted to a binary number in the" +
                "form of a string.");
        System.out.println("The string is then analyzed to determine the maximum number of consecutive 1s.");
        System.out.println("\nEnter any positive integer.");
    }

    public static String convertToBinary(int number) {
        String binaryNumberIn = "";
        while (number > 0) {
            binaryNumberIn += number % 2;
            number /= 2;
//            System.out.println(binaryNumberIn); //Debug info.
//            System.out.println(number); //Debug info.
        }
        char[] reverseBinary = binaryNumberIn.toCharArray();
        String binaryNumberOut = "";
        for (int i = binaryNumberIn.length() - 1; i >= 0; i--) {
            binaryNumberOut += reverseBinary[i];
        }
//        System.out.println(binaryNumberOut); //Debug info.
        return binaryNumberOut;
    }

    public static void findMaxOnes(String input) {
        int maxOnes = 0;
        int counter = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == '1') {
                counter++;
                if (counter > maxOnes) {
                    maxOnes = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(maxOnes);
    }
}