import java.util.Scanner;

public class MyArrays {
    public static int[] minToBegin (int[] a) {
        int min = a[0], index = 0;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        for (int i = index; i > 0; --i) {
            min = a[i - 1];
            a[i - 1] = a[i];
            a[i] = min;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; ++i) {
            mas[i] = in.nextInt();
        }
        mas = minToBegin(mas);
        for (int i = 0; i < size; ++i) {
            System.out.print(mas[i] + " ");
        }
    }
}