import java.io.*;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(new FileInputStream("SimJiaHong_U2005316.txt"));
            while(input.hasNext()){
                System.out.println(input.nextLine());
            }
            input.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        }

        // Part 2
        Scanner sc = new Scanner(System.in);
        String str = "";
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("SimJiaHong_U2005316.txt", true));
            while(!str.equalsIgnoreCase("FALSE")){
                output.println(str);
                System.out.println("Please enter something to the letter. Enter FALSE to stop.");
                str = sc.nextLine();
            }
            output.close();
        } catch (IOException e){
            System.out.println("Error with file output");
        }


        try {
            Scanner input = new Scanner(new FileInputStream("SimJiaHong_U2005316.txt"));
            while(input.hasNext()){
                System.out.println(input.nextLine());
            }
            input.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
