import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            x[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(x));
        QuickSort(x, 0, 9);
        x = Arrays.stream(x).distinct().toArray();
        System.out.println(Arrays.toString(x));
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (arr.length == 0) return;
        if (low >= high - 1) return;
        int middle = low + (high - low) / 2;
        int op = arr[middle];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] < op) {
                i++;
            }
            while (arr[j] > op) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < i) QuickSort(arr, low, j);
        if (high > i) QuickSort(arr, i, high);
    }
}

