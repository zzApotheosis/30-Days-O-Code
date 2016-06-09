/*
 * Created by Steven Jennings (zzApotheosis) on 09 June 2016.
 *
 * Good stuff here. I actually thought this was going to be more difficult, but it's not that bad.
 * This exercise implements inheritance from day 12 and introduces the concept of abstract classes.
 * Seems simple enough. Abstract classes don't really do much in and of themselves, but
 * they serve very well as superclasses. In this case, MyBook and Book.
 *
 * Well done, HackerRank. Well done. I'm learning more about Java in this challenge than I ever
 * have in my crappy CS1 class.
 */

package day13;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}