import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = 0;
        if (a % 5 == 0 && a > 99 && a < 1000) sum++;
        if (b % 5 == 0 && b > 99 && b < 1000) sum++;
        if (c % 5 == 0 && c > 99 && c < 1000) sum++;
        if (sum > 1) System.out.println("true");
        else System.out.println("false");
    }
}