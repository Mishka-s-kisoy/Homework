import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        double a = Float.parseFloat(s);
        if ((a >= -2. && a <= 3.) || (a >= 6. && a <= 9.)){
            System.out.println("false");
        }
        else System.out.println("true");
    }
}