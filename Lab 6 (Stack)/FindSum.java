package lab6;

public class FindSum {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i <= 20; i++) {
            stack.push(i);
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println("Sum: " + sum);
    }

}
