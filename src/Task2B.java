import java.util.Arrays;

public class Task2B {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:\n" + Arrays.toString(arr));

        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            counter++;
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                counter++;
                if (arr[j] < arr[minIndex]) {
                    counter++;
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After:\n" + Arrays.toString(arr));
        System.out.println("Number of actions: " + counter);
    }
}