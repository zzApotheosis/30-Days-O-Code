/*
 * Created by Steven Jennings (zzApotheosis) on 10 June 2016.
 */

package day14;

class Difference {
    private int[] elements;
    int maximumDifference;
    // Add your code here
    Difference(int[] input) {
        this.elements = input;
    }

    void computeDifference() {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int element : this.elements) {
            if (element < minValue) {
                minValue = element;
//                System.out.println("New minValue = " + minValue); //Debug info
            }
            if (element > maxValue) {
                maxValue = element;
//                System.out.println("New maxValue = " + maxValue); //Debug info
            }
        }

        int diff = maxValue - minValue;
        this.maximumDifference = Math.abs(diff);
    }
} // End of Difference Class