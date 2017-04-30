/*
 * Created by Steven Jennings (zzApotheosis) on 12 June 2016.
 *
 * This task made little sense to me... Although I do believe it just takes practice and experience
 * to fully understand the functionality of a Linked List in Java. Credit for this code goes to
 * GitHub user reneargento.
 *
 * https://github.com/reneargento/hacker-rank-30-days-of-code/blob/master/Java%20Solutions/Day15.java
 */

package day15;

import java.util.Scanner;

public class Solution {
    private static Node insert(Node head, int data) {
        Node current = head;
        Node newNode = new Node(data);

        if (current == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        while (N-->0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
    }
}