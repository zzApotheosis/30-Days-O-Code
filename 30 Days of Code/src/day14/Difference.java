/*
 * Created by Steven Jennings (zzApotheosis) on 10 June 2016.
 */

package day14;

class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] input) {
        this.elements = input;
    }

    void computeDifference() {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] < minValue) {
                minValue = this.elements[i];
//                System.out.println("New minValue = " + minValue); //Debug info
            }
            if (this.elements[i] > maxValue) {
                maxValue = this.elements[i];
//                System.out.println("New maxValue = " + maxValue); //Debug info
            }
        }

        int diff = maxValue - minValue;
        this.maximumDifference = Math.abs(diff);
    }
} // End of Difference Class