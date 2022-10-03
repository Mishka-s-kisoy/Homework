import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int min = 9999;
        int[] mas = new int[s];
        mas[0] = in.nextInt();
        for (int i = 1; i < s; i++) {
            mas[i] = in.nextInt();
            if (mas[i] > mas[i - 1]) System.out.print(mas[i] + " ");;
        }
    }
}