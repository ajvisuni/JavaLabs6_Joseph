import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:\n" + Arrays.toString(arr));

        for (int i = 0; i < 9; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println("After:\n" + Arrays.toString(arr));
    }
}