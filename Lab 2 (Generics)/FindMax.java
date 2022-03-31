public class FindMax {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};
        String[] words = {"red", "green", "blue"};
        Circle[] radius = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println(max(numbers));
        System.out.println(max(words));
        System.out.println(max(radius));

    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;
    }
}
