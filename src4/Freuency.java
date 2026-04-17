import java.util.HashMap;

public class Freuency {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5);
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq);
    }
}
