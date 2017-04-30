/*
 * Created by Steven Jennings (zzApotheosis) on 30 April 2017.
 * 
 * Again, full credit for this solution goes to GitHub user xeoneux:
 * https://github.com/xeoneux/30-Days-of-Code/blob/master/R%20-%20BST%20Level-Order%20Traversal/Solution.java
 */

package day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            System.out.print(curr.data + " ");

            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
    }

    public static Node insert(Node root, int data) {
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
        levelOrder(root);
    }
}