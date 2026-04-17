import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[arr.length-1-i]);
        }
    }
}
