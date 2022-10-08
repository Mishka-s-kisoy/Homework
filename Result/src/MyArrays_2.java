import java.util.Scanner;

class MyArrays_2 {

    public static double avgOf4Digit(int[] a) {
        double res = -1, sum = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > 999 && a[i] < 10000) {
                sum += a[i];
                ++res;
            }
        }
        if (res != -1.) return sum / (res + 1);
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; ++i) {
            mas[i] = in.nextInt();
        }
        System.out.println(avgOf4Digit(mas));
    }
}