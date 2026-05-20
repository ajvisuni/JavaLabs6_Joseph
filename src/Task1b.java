import java.util.Arrays;

public class Task1b {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:\n" + Arrays.toString(arr));

        int counter = 0;

        // Nested loops
        for (int i = 0; i < arr.length - 1; i++) {
            counter++; // Counting the outer loop call
            for (int j = 0; j < arr.length - 1; j++) {
                counter++; // Counting the inner loop call

                if (arr[j] > arr[j+1]) {
                    counter++; // Counting the if statement action (swap)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After:\n" + Arrays.toString(arr));
        System.out.println("Number of actions: " + counter);
    }
}