import java.util.Arrays;

public class Task2C {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:\n" + Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int minIndex = i;
            int maxIndex = i;

            for (int k = i; k <= j; k++) {
                if (arr[k] > arr[maxIndex]) {
                    maxIndex = k;
                } else if (arr[k] < arr[minIndex]) {
                    minIndex = k;
                }
            }

            int tempMin = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tempMin;

            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            int tempMax = arr[j];
            arr[j] = arr[maxIndex];
            arr[maxIndex] = tempMax;
        }

        System.out.println("After:\n" + Arrays.toString(arr));
    }
}