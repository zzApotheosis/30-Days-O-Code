/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 *
 * I feel bad. I probably shouldn't have skipped so many days. I think I'm like 5 days behind the challenge,
 * but oh well. I started summer classes so I haven't really had much free time to progress through this
 * magical coding journey. I'm not giving up, though. I'll finish this whole HackerRank 30 Days of Code
 * adventure even if it kills me.
 *
 * But anyway, this was pretty fun to write. I watched Kathryn Hodge's complimentary tutorial on YouTube
 * and learned quite a bit about Interfaces in Java. I still need to get more familiar with
 * Linked Lists and Abstract Classes before I feel comfortable with
 * whatever is left in this awesome coding journey.
 */

package day19;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}