package SearchingandSorting;

public class InsertionSortExample {

    public static void insertionSort(int[] arr) {
        // Start from index 1 because a single element (index 0) is already "sorted"
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];   // The element we want to insert into the sorted part
            int j = i - 1;

            // Shift elements of the sorted part to the right
            // if they are greater than the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};

        insertionSort(numbers);

        // Print the sorted array
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
