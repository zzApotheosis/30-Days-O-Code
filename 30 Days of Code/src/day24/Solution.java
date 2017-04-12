/*
 * Created by Steven Jennings (zzApotheosis) on 24 June 2016.
 *
 * Original code by GitHub user reneargento.
 * https://github.com/reneargento/hacker-rank-30-days-of-code/blob/master/Java%20Solutions/Day24.java
 *
 * This last week or so of the challenge is pretty draining. I still never fully understood Linked Lists
 * and because of that, Queues and Stacks as well. I actually skipped Day 23 as well since it builds on
 * Day 22, which I never fully understood. It's pretty disappointing to see my coding journey get so
 * rough, but I still enjoy Java. I'll eventually get to understand how all of this works. It just looks
 * like I'll have to spend more than 30 days getting to understand everything.
 */

package day24;

import java.util.Scanner;

public class Solution {

    private static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            while (current.next != null && current.data == current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }

    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}