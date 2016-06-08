/**
 * Created by Steven Jennings (zzApotheosis) on 29 May 2016.
 */

package day02;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        int totalPercent = tipPercent + taxPercent;
        double extraCost = totalPercent * 0.01 * mealCost;
        double subTotalCost = mealCost + extraCost;
        System.out.println("At this point, the subtotal is " + subTotalCost);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int)Math.round(subTotalCost);
        
        // This line should be commented out for the HackerRank challenge.
        double totalRealCost = (double)Math.round(subTotalCost * 100)/100;

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
        
        // This line should be commented out for the HackerRank challenge.
        System.out.println("The real cost without rounding is " + totalRealCost + " dollars.");
    }
}