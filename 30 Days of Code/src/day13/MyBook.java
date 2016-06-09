/*
 * Created by Steven Jennings (zzApotheosis) on 09 June 2016.
 */

package day13;

class MyBook extends Book {
    int price;

    MyBook(String t, String a, int p) {
        super(t, a);
        this.price = p;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}