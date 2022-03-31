public class CompareMax {

    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maximum(10, 50, 30));
        System.out.println(maximum(20.5, 18.9, 90.0));
        System.out.println(maximum("Apple", "Orange", "Mango"));
    }

}
