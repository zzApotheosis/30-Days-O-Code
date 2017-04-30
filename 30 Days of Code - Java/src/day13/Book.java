/*
 * Created by Steven Jennings (zzApotheosis) on 09 June 2016.
 */

package day13;

import java.util.*;

abstract class Book {
    String title;
    String author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
    abstract void display();
}