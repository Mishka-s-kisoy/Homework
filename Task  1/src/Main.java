import java.util.Scanner;

    class NumberDigits {
        int a;
        int b;

        public NumberDigits(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public static int sumOfSeven(NumberDigits c) {
            int res = 0;
            for (int i = c.a; i <= c.b; ++i) {
                if (i % 7 == 0 && i > 9 && i < 100) {
                    res += i % 10 + i / 10 % 100;
                }
            }
            return res;
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberDigits sum = new NumberDigits(in.nextInt(), in.nextInt());
        System.out.println(sum.sumOfSeven(sum));
    }
}
