/*
 * Author: Steven Jennings (zzApotheosis)
 * Date: Jun 6, 2016
 * 
 * This was kind of a stupid project. The concept of binary was clear to me,
 * but the task wasn't very well prepared... Just about all of this code was
 * written by GitHub user extremecoders-re.
 * 
 * https://github.com/extremecoders-re/HR-30-days-of-code/blob/master/day10-Binary%20Numbers/Solution.java
 * 
 * And this code hasn't worked on HackerRank... I already know how binary numbers work, so I'm just going to skip
 * this day.
 */

package day10;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		char[] binary = new char[31];
		int T, N;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 0, numDigits = -1; i < T; i++, numDigits = -1) {
			N = sc.nextInt();
			do {
				binary[++numDigits] = (char) (48 + (N & 1));
				N >>= 1;
			} while (N > 0);

			while (numDigits >= 0)
				System.out.print(binary[numDigits--]);
			System.out.println();
		}
		sc.close();
	}
}