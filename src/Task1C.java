import java.util.Arrays;

public class Task1C {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:\n" + Arrays.toString(arr));

        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            counter++;
            // Optimization: subtract 'i' so we don't check already sorted elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                counter++;

                if (arr[j] > arr[j+1]) {
                    counter++;
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