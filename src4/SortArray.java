import java.util.Arrays;

public class SortArray {

    public void mergeSort(int[] arr) {
        int mid = arr.length / 2;
        if (arr.length == 1) {
            return;
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
        }
        if (arr.length > 2) {
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        SortArray obj = new SortArray();
        obj.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
