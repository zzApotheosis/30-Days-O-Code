/*
 * Created by Steven Jennings (zzApotheosis) on 30 April 2017.
 */

package day23;

public class Node {
    Node left, right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}