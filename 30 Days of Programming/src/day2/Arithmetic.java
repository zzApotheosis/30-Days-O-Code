package day2;

/**
 * Created by zzapo on 5/29/2016.
 */

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
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

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int)Math.round(subTotalCost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}