package week1;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.print("Num of col: ");
        m = scanner.nextInt();
        System.out.print("Num of row: ");
        n = scanner.nextInt();

        System.out.println("Result is : ");
        int[][] metric1 = new int[m][n];
        int[][] metric2 = new int[m][n];
        int[][] sumMetric = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input A[" + i + ", " + j + "]: ");
                metric1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input B[" + i + ", " + j + "]: ");
                metric2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                sumMetric[i][j] = metric1[i][j] + metric2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(sumMetric[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
