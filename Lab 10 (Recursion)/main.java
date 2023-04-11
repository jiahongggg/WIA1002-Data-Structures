public class main {

    public static void main(String[] args) {

        permuteString("", "ABC");

    }

    public static long fib(long index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fib(index - 1) + fib(index - 2);
    }

    public static String substituteAI(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.charAt(0) == 'a') {
            return 'i' + substituteAI(str.substring(1));
        } else {
            return str.charAt(0) + substituteAI(str.substring(1));
        }
    }


    public static void permuteString(String start, String end) {
        if (end.length() <= 1) {
            System.out.println(start + end);
        } else {
            for (int i = 0; i < end.length(); i++) { // i = 0
                String newString = end.substring(0, i) + end.substring(i + 1);
                permuteString(start + end.charAt(i), newString);
            }
        }
    }

    public static long exponent(int x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return x;
        }
        return x * exponent(x, y - 1);
    }

}
