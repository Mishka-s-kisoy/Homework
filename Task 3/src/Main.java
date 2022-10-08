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

    public static int minToBegin (MyArrays c) {
        int min = c.a[0], index = 0, res = -1;
        for (int i = 1; i < c.length; ++i) {
            if (c.a[i] < min) {
                min = c.a[i];
                index = i;
                ++res;
            }
        }
        for (int i = index; i > 0; --i) {
            min = c.a[i - 1];
            c.a[i - 1] = c.a[i];
            c.a[i] = min;
        }
        if (res != -1) return 0;
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyArrays sum = new MyArrays(in.nextInt(), in);
        if(sum.minToBegin(sum) == 0) {
            for (int i = 0; i < sum.length; ++i) {
                System.out.print(sum.a[i] + " ");
            }
        }
        else System.out.println(-1);
    }
}