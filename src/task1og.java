
import java.util.Arrays;

public class task1og {
    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));
        /********task 1A ************/
        for (int j = 0; j < array.length - 1; j++){
            if(array[j] > array[j+1]){
                    int greater = array[j];
                    array[j]=array[j+1];
                    array[j+1]=greater;
            }
        }
    }
}

