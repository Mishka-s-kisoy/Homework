import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] mas = new int[s];
        int min = 9999;
        for (int i = 0; i < s; i++) {
            mas[i] = in.nextInt();
            if (mas[i] > 0 && mas[i] < min) min = mas[i];
        }
        System.out.print(min);
    }
}