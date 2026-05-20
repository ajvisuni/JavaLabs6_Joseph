import java.util.Arrays;

public class Task1D {
    public static void main(String[] args) {
        // Using an already sorted array to test the best-case scenario
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Before:\n" + Arrays.toString(arr));

        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            counter++;
            boolean swapped = false; // Add boolean variable here

            for (int j = 0; j < arr.length - 1 - i; j++) {
                counter++;

                if (arr[j] > arr[j+1]) {
                    counter++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps occurred in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("After:\n" + Arrays.toString(arr));
        System.out.println("Number of actions: " + counter);
    }
}
