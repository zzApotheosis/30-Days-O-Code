/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 *
 * I feel like these are getting easier. This whole solution was written with just 5 lines of code
 * and 2 of those lines are literally closing curly braces.
 */

package day21;

public class Solution {

    private static <A> void printArray(A[] array) {
        for (A element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (Solution.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}