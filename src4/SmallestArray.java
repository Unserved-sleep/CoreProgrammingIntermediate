public class SmallestArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int min = arr[0];
        for(int i : arr) {
            if(i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
