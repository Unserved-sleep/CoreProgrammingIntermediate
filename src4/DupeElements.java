import java.util.HashMap;
import java.util.Scanner;

public class DupeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if(freq.get(arr[i]) > 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
