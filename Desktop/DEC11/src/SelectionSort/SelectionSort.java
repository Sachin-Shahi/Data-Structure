package SelectionSort;

/**
 * Created by DAGR8DON on 12/11/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 4, 7, 3, 14, 0, 2, 5};

        for (int min = 0; min < array.length; min++) {
            for (int i = min + 1; i < array.length; i++) {
                if (array[min] > array[i]) {
                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
