import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        separatedCharacter("text1.txt", ",");
        separatedCharacter("text2.txt", ", ");
        separatedCharacter("text3.txt", "; ");
        separatedCharacter("text4.txt", "[1-9]{3}"); // 123 456 789

    }

    public static void separatedCharacter(String file, String sentence) {
        try {
            int num = 0;
            Scanner input = new Scanner(new FileInputStream(file));
            while (input.hasNext()) {
                String[] str = input.nextLine().split(sentence);
                for (int i = 0; i < str.length; i++) {
                    System.out.print(str[i] + " ");
                    num++;
                }
                System.out.println();
            }
            System.out.println("Number of character: " + num + "\n");
            input.close();
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
