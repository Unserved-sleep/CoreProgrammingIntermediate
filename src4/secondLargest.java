import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int sec = arr[0];
        for(int i : arr) {
            if(i > max) {
                sec = max;
                max = i;
            } else if(i > sec) {
                sec = i;
            }
        }
        System.out.println(sec);
    }
}
