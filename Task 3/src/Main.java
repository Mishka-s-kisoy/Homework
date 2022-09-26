import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 60 / 60;
        int c = a / 60;
        while (c > 59){
            c -= 60;
        }
        int d = a - (b * 3600 + c * 60);
        System.out.printf(b + ":");
        if (c < 10 && c > 0) System.out.printf("0" + c + ":");
        else if (c <= 0) System.out.printf("00:");
        else System.out.printf(c + ":");
        if (d < 10 && d > 0) System.out.printf("0" + d);
        else if (d <= 0) System.out.printf("00");
        else System.out.printf(d + "");
    }
}