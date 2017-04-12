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
        Scanner in = new Scanner(System.in);
        int stdin = in.nextInt();
        in.close();
        String binaryIn = convertToBinary(stdin);
//        System.out.println(binaryIn); //Debug info. Uncomment to see binary number of stdin.
        findMaxOnes(binaryIn);
    }

    private static String convertToBinary(int number) {
        StringBuilder binaryNumberIn = new StringBuilder();
        while (number > 0) {
            binaryNumberIn.append(number % 2);
            number /= 2;
//            System.out.println(binaryNumberIn); //Debug info.
//            System.out.println(number); //Debug info.
        }
        char[] reverseBinary = binaryNumberIn.toString().toCharArray();
        StringBuilder binaryNumberOut = new StringBuilder();
        for (int i = binaryNumberIn.length() - 1; i >= 0; i--) {
            binaryNumberOut.append(reverseBinary[i]);
        }
//        System.out.println(binaryNumberOut); //Debug info.
        return binaryNumberOut.toString();
    }

    private static void findMaxOnes(String input) {
        int maxOnes = 0;
        int counter = 0;
        char[] inputArray = input.toCharArray();
        for (char anInputArray : inputArray) {
            if (anInputArray == '1') {
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