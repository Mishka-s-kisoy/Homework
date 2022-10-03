import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int a = s.length() - 1;
        if (s.charAt(0) == '-') System.out.print('-');
        for (int i = s.length() - 1; i >= 0; --i){
            char c = s.charAt(i);
            if ((i == a && c == '0') || c == '-'){
                --a;
            }
            else System.out.print(c);
        }
    }
}