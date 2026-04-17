public class EvenPos {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            if(i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
