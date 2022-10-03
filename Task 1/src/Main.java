import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int a = in.nextInt();
        for (int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            int b = c - '0';
            if (b != a) System.out.print(c);
        }
    }
}