/*
 * Created by Steven Jennings (zzApotheosis) on 07 June 2016.
 *
 * I would have customized the size of the input matrix by user input, but the HackerRank challenge seems to
 * limit its input matrix to 6x6, so the default size of this program is 6x6. In the main method,
 * integer variables x and y dictate the matrix size, so feel free to modify them.
 */

package day11;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        explain();

        Scanner in = new Scanner(System.in);
        int x = 6; //Matrix dimensions
        int y = 6;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();

        int[][] sumArray = new int[matrix.length - 2][matrix[0].length - 2];
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                sumArray[i][j] = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] + matrix[i + 1][j + 1] + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
//                System.out.println("sumArray = " + sumArray[i][j]); //Debug info.
            }
        }

//        System.out.println("Test: " + sumArray.length); //Debug info.

        findLargest(sumArray); //Prints the largest value as well.
    }

    public static void explain() {
        //Explains the program to the user.
        System.out.println("This program accepts a 6x6 matrix of integers as input." +
                "\nThe program searches through the array for each possible \"hourglass\" shape, like so:");
        System.out.println("\nI I I\n  I  \nI I I");
        System.out.println("\nThe program will then find the hourglass shape whose sum of integers is the largest," +
                " and print the results to the console.");
        System.out.println("Input matrix example:\n");
        System.out.println("1 1 1 0 0 0\n0 1 0 0 0 0\n1 1 1 0 0 0\n0 0 2 4 4 0\n0 0 0 2 0 0" +
                "\n0 0 1 2 4 0");
        System.out.println("\nEnter your 6x6 matrix of integers.");
    }

    public static void findLargest(int[][] search) {
        int largestValue = Integer.MIN_VALUE;

        for (int i = 0; i < search.length; i++) {
            for (int j = 0; j < search[i].length; j++) {
//                System.out.println("Current largest value = " + largestValue); //Debug info.
                if (search[i][j] > largestValue) {
                    largestValue = search[i][j];
                }
            }
        }

        System.out.println(largestValue);
    }
}