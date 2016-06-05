package day5;

/**
 * Created by zzapo on 6/1/2016.
 */

//import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        loop(N);
    }

    public static void loop(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}
