import java.util.Scanner;

    class MyArrays {
        int length = 0;
        int[] a = new int[1000];

        public MyArrays(int size, Scanner in) {
            this.length = size;
            for (int i = 0; i < length; ++i) a[i] = in.nextInt();
        }

        public static double avgOf4Digit(MyArrays c) {
            double res = -1, sum = 0;
            for (int i = 0; i <= c.length; ++i) {
                if (c.a[i] > 999 && c.a[i] < 10000) {
                    sum += c.a[i];
                    ++res;
                }
            }
            if (res != -1.) return sum / (res + 1);
            return res;
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyArrays sum = new MyArrays(in.nextInt(), in);
        System.out.println(sum.avgOf4Digit(sum));
    }
}