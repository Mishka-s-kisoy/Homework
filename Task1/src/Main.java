import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 10 + a / 10 % 10 + a / 100 % 10;
        int c = (a + 2) / 2 * 2;
        System.out.println(b + " " + c);
    }
}