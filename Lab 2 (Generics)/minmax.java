public class minmax {

    public static void main(String[] args) {

        Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArr = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArr));
        System.out.println(minmax(strArr));
    }

    public static <E extends Comparable<E>> E minmax(E[] array) {
        E min = array[0];
        E max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return (E) ("Min = " + min + "  Max = " + max);
    }
}
