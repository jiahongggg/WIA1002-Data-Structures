import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.print("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Queue<String> queue = new LinkedList<>();

        for (int i = input.length() - 1; i >= 0; i--) {
            queue.add(String.valueOf(input.charAt(i)));
        }

        StringBuilder reverseString = new StringBuilder();
        while (!queue.isEmpty()) {
            reverseString = new StringBuilder(reverseString + queue.remove());
        }

        if (input.equalsIgnoreCase(String.valueOf(reverseString))) {
            System.out.println(input + " is palindrome.");
        } else {
            System.out.println(input + " is not palindrome.");
        }
    }


}
