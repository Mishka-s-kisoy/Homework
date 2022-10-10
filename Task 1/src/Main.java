import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int[][] a;
        int b = in.nextInt();
        int c = in.nextInt();
        a = new int[b][c];
        System.out.print("     ");
        for (int i = 0; i < c; i++){
            System.out.print("(" + i + ")");
            if (i != c - 1 && i != 0) {
                int d = i + 1;
                int sum = 1;
                if (d > 9) {
                    sum = 0;
                    while (d > 0) {
                        sum++;
                        d /= 10;
                    }
                }
                sum = 7 - sum;
                for (int z = 0; z < sum; z++) {
                    System.out.print(" ");
                }
            }
            else if (i == 0) System.out.print("      ");
        }
        System.out.println();
        for (int i = 0; i < b; i++){
            System.out.print("(" + i + ")   ");
            for (int j = 0; j < c; j++) {
                a[i][j] = i * j;
                System.out.print(a[i][j]);
                if (j != c - 1) {
                    int d = i * (j + 1);
                    int sum = 1;
                    if (d > 9) {
                        sum = 0;
                        while (d > 0) {
                            sum++;
                            d /= 10;
                        }
                    }
                    sum = 9 - sum;
                    for (int z = 0; z < sum; z++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}