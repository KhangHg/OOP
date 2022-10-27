package week1;

import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input height of triangle n:");
        int n = keyboard.nextInt();

        System.out.println("Result :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 2; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
