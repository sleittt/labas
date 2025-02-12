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
        CombSort(x);
        x = Arrays.stream(x).distinct().toArray();
        System.out.println(Arrays.toString(x));
    }

    public static void CombSort(int[] arr) {
        double factor = 1.247;
        int step = arr.length;
        while (step >= 1) {
            for (int i = 0; i + step < arr.length; ++i) {
                if (arr[i] > arr[i + step]) {
                    swap(arr, i, i + step);
                }

            }
            step /= factor;
        }

    }

    static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}