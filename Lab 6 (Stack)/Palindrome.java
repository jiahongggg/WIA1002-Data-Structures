package lab6;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String forward = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < forward.length(); i++) {
            stack.push(forward.charAt(i));
        }

        StringBuilder backward = new StringBuilder();
        while (!stack.isEmpty()) {
            backward.append(stack.pop());
        }

        if (forward.equalsIgnoreCase(backward.toString())) {
            System.out.println(forward + " is palindrome");
        } else {
            System.out.println(forward + " is not palindrome");
        }

    }
}

