import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n * n;
        int b = 0;
        int index = n - 1;
        int index_2 = 0;
        int index_0 = 0;
        int d = 1;
        int c = n;
        int sum = 1;
        int param = n * 2 - 1;
        int index_3 = 1;
        int index_4 = n - 1;
        int index_5 = n - 1;
        int index_6 = n - 2;
        int index_7 = 1;
        int index_8 = 0;
        int index_9 = n - 2;
        int index_10 = 0;
        int index_11 = n - 1;
        int[][] data = new int[n][n];
        for (int i = 1; i < param; i++){
            if (b == 0) {
                for (int j = index_0; j <= index; j++) {
                    data[index_2][j] = sum;
                    ++sum;
                    if (data[index_2][j] == n * n) break;
                }
                ++index_2;
                ++index_0;
                --index;
                ++b;
            }
            else if (b == 1){
                for (int j = index_3; j <= index_4; j++) {
                    data[j][index_5] = sum;
                    ++sum;
                    if (data[j][index_5] == n * n) break;
                }
                --index_5;
                ++index_3;
                --index_4;
                ++b;
            }
            else if (b == 2) {
                for (int j = index_9; j >= index_10; j--) {
                    data[index_11][j] = sum;
                    ++sum;
                    if (data[index_11][j] == n * n) break;
                }
                --index_11;
                ++index_10;
                --index_9;
                ++b;
            }
            else {
                for (int j = index_6; j >= index_7; j--) {
                    data[j][index_8] = sum;
                    ++sum;
                    if (data[j][index_8] == n * n) break;
                }
                ++index_8;
                ++index_7;
                --index_6;
                b = 0;
            }
        }
        int index_12 = n / 2;
        int index_13 = n / 2;
        if (n % 2 == 0) --index_12;
        data[index_13][index_12] = n * n;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                int e = data[i][j];
                int sum_2 = 1;
                if (e > 9) {
                    sum_2 = 0;
                    while (e > 0) {
                        sum_2++;
                        e /= 10;
                    }
                }
                sum_2 = 4 - sum_2;
                for (int z = 0; z < sum_2; z++) {
                    System.out.print(" ");
                }
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }
}