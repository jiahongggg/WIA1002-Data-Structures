package lab6;

import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {

        MyStack<Integer> s1 = new MyStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();
        for(int i=1; i<=value; i++){{
            s1.push(i);
        }}
        System.out.println("The size of the stack is " + s1.getSize());
        while(!s1.isEmpty()){
            int num = s1.pop();
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
