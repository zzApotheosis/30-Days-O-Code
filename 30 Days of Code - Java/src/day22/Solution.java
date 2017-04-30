/*
 * Created by Steven Jennings (zzApotheosis) on 22 June 2016.
 *
 * Alright, I can't figure this one out for the life of me.
 * I said on yesterday's challenge that things started to be looking better, but I guess karma's a bitch.
 *
 * I'm gonna leave this one incomplete until I care again. I'll skip to day 23.
 * 
 * Update 30 April 2017:
 * I'm lazy. I admit it. Thanks to GitHub user xeoneux:
 * https://github.com/xeoneux/30-Days-of-Code/blob/master/Q%20-%20Binary%20Search%20Trees/Solution.java
 */

package day22;

import java.util.Scanner;

public class Solution {

    private static int getHeight(Node root) {
        return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        int height = getHeight(root);
        System.out.println(height);
    }
}