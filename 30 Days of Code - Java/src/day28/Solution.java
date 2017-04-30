/*
 * Created by Steven Jennings (zzApotheosis) on 10 April 2017.
 * 
 * Getting close to the end here. This was definitely the longest 30 days I've ever
 * lived in my life! This code, like Day 27, was originally written by GitHub user xeoneux:
 * https://github.com/xeoneux/30-Days-of-Code/tree/master/X%20-%20RegEx%2C%20Patterns%2C%20and%20Intro%20to%20Databases
 */

package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = in.next();
            String email = in.next();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) list.add(name);
        }

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}