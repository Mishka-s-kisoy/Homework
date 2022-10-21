import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        byte[] a = new byte[size];
        for (int i = 0; i < size; i++){
            boolean bool = in.nextBoolean();
            if (bool) {
                a[i] = 1;
            }
            else a[i] = 0;
        }
        for (int i = 0; i < size; i++){
            if (a[i] == 1) {
                System.out.print(true + " ");
            }
            else System.out.print(false + " ");
        }
    }
}