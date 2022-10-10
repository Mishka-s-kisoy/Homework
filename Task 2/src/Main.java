import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = 101;
        int index = 0;
        int c = 0;
        int d = 0;
        int a;
        int b;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                a = c;
                b = c + m;
                c = b;
                d = 1;
                for (int j = a; j < b; j+=d){
                    int e = j;
                    int sum = 1;
                    if (j > 9) {
                        sum = 0;
                        while (e > 0) {
                            sum++;
                            e /= 10;
                        }
                    }
                    sum = 4 - sum;
                    for (int z = 0; z < sum; z++) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                }
            }
            else {
                a = c + m - 1;
                b = c - 1;
                c = a + 1;
                d = -1;
                for (int j = a; j > b; j+=d){
                    int e = j;
                    int sum = 1;
                    if (j > 9) {
                        sum = 0;
                        while (e > 0) {
                            sum++;
                            e /= 10;
                        }
                    }
                    sum = 4 - sum;
                    for (int z = 0; z < sum; z++) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}