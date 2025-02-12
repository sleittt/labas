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
        //CombSort(x);
        Pyramid(x);
        x = Arrays.stream(x).distinct().toArray();
        System.out.println(Arrays.toString(x));
    }

    public static void Pyramid(int[] arr) {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arr, i--, n);
        }
        while (n > 0) {
            arr[n - 1] = pop(arr, n);
            n--;
        }
    }

    public static int pop(int[] arr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = arr[0];
        arr[0] = arr[size - 1];
        heapify(arr, 0, size - 1);
        return top;
    }
    static void heapify(int[] arr, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;
        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
            if (largest != i) {
                swap(arr, i, largest);
                heapify(arr, largest, size);
            }
        
    }

    static int LEFT(int i) {
        return 2 * i;
    }

    static int RIGHT(int i) {
        return 2*i+1;
    }


    /*public static void CombSort(int[] arr) {
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

    }*/

    static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}