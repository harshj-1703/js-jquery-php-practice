import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9, 4 };
        System.out.println("Original array: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key, to one position
            // ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
