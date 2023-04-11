public class insertionSort {

    public static void main(String[] args) {

        int[] list = {3, 2, 8, 6, 5, 4, 1, 9, -7};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }
}
