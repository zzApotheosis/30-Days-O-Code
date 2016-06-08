/**
 * Created by Steven Jennings (zzApotheosis) on 04 June 2016.
 *
 * Got help from Kathryn Hodge and her github solution.
 * https://github.com/blondiebytes/30-Days-of-Code/blob/master/HackerRank%20Challenge%20Solutions/Day%208/Solution.java
 *
 * I totally could have solved this myself... I just didn't know about HashMaps and/or Dictionaries.
 */

package day08;

import java.util.*;

public class Solution {
    public static int index;
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Integer> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        makePhoneBook();
        searchPhoneBook();
        sc.close();
    }

    public static void makePhoneBook() {
        index = sc.nextInt(); //Entering the number of phone book entries
        for (int i = 0; i < index; i++) {
            phoneBook.put(sc.next(), sc.nextInt());
        }
    }

    public static void searchPhoneBook() {
        /**
         * For the HackerRank challenge, this uses a number of searches equal to the number of keys in the
         * HashMap. But for a real search method, I would just search once. This is left as is for the
         * HackerRank challenge.
         */
        String search;
        for (int i = 0; i < phoneBook.size(); i++) {
            search = sc.next();
            if (phoneBook.containsKey(search)) {
                System.out.println(search + "=" + phoneBook.get(search));
            } else {
                System.out.println("Not found");
            }
        }
    }
}