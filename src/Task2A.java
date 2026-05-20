import java.util.Arrays;

public class Task2A {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("In array:\n" + Arrays.toString(arr));

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("The minimum value is on the index: " + minIndex);
    }
}