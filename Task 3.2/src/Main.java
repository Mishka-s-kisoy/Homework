import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int min = 9999;
        for (int i = 0; i < s; i++) {
            int a = in.nextInt();
            if (a > 0 && a < min) min = a;
        }
        System.out.print(min);
    }
}