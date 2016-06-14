/*
 * Created by Steven Jennings (zzApotheosis) on 13 June 2016.
 */

package day17;

class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int)Math.pow(n, p);
        }
    }
}