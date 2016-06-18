/*
 * Created by Steven Jennings (zzApotheosis) on 18 June 2016.
 *
 * Honestly, I didn't completely understand this task even after watching the tutorial video.
 * The majority of this code was written by GitHub user reneargento.
 * https://github.com/reneargento/hacker-rank-30-days-of-code/blob/master/Java%20Solutions/Day18.java
 *
 * I'm not giving up... even though this is almost 3 days late. I'll eventually get to understand queues and stacks.
 */

package day18;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    Queue<Character> queue = new LinkedList<>();
    Deque<Character> stack = new ArrayDeque<>();

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char dequeueCharacter() {
        return queue.remove();
    }
}