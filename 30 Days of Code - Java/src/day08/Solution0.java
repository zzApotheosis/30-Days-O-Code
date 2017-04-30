package day08;

/**
 * Created by zzapo on 6/5/2016.
 * This was my (pathetic) attempt at the Day 8 solution.
 * I tried using arrays to assign names and numbers to corresponding indexes, but couldn't make it work...
 * The instructions recommended HashMaps and/or dictionaries, so I checked out Kathryn Hodge's YouTube tutorial about
 * this day of coding, and she was able to teach me about HashMaps and Dictionaries. Basically, they're awesome
 * versions of arrays. I completed the challenge in the other class "Solution0".
 */

import java.util.*;
//import java.io.*;

public class Solution0 {
    public static int num;
    public static String[] name;
    public static int[] phoneNumber;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        setArrayBounds();
        makePhoneBook();
        searchPhoneBook();
        in.close();
    }

    public static void setArrayBounds() {
        num = in.nextInt();
        name = new String[num];
        phoneNumber = new int[num];
    }

    public static void makePhoneBook() {
        for (int i = 0; i < num; i++) {
            name[i] = in.next();
            System.out.println("name[" + i + "] = " + name[i]); //Debugging name
            phoneNumber[i] = in.nextInt();
            System.out.println("phoneNumber[" + i + "] = " + phoneNumber[i]); //Debugging phoneNumber
        }
    }

    public static void searchPhoneBook() {
        for (int i = 0; i < num; i++) {
            String search = in.next();

            for (int j = 0; j < num; j++) {

                if (search == name[j]) {
                    System.out.println(name[j] + "=" + phoneNumber[j]);
                }
            }
        }
    }
}