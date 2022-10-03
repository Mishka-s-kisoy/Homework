import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int a = in.nextInt();
        for (int i = 1; i < s; i++) {
            int b = in.nextInt();
            if (b > a) System.out.print(b + " ");
            a = b;
        }
    }
}