import java.util.Scanner;

public class FlipCoin {
    static int head = 0;
    static int tail = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int toss = (int) Math.round(Math.random());
            int x = toss == 0? head++ : tail++;
            System.out.println(x);
        }
        System.out.println("Heads: " + head + " Tails: " + tail);
    }
}
