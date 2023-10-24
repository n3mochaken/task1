import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3};
        sort(arr1);

    }
}