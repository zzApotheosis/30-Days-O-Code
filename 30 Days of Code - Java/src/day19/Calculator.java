/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 */

package day19;

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}