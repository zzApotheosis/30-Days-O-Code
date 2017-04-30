/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 */

package day22;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}