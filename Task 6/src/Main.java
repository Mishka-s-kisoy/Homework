import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s2 = in.next();
        double x = Float.parseFloat(s);
        double y = Float.parseFloat(s2);
        if (y <= 2 - x * x && (y >= x || y >= 0)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}