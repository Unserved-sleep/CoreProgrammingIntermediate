public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int max = arr[0];
        for(int i : arr) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
