import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (Math.pow(2, i) < Math.pow(2, n)) {
            System.out.println((int) Math.pow(2, i));
            i++;
        }
    }
}
