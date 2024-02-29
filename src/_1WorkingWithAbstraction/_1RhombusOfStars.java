package _1WorkingWithAbstraction;

import java.util.Scanner;

public class _1RhombusOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int starCount = 1; starCount <= n; starCount++) {
            printRow(n, starCount);
        }
        for (int starCount = n - 1; starCount >= 1; starCount--) {
            printRow(n, starCount);
        }
    }
    public static void printRow(int n, int sC){
        for (int i = 0; i < n - sC; i++)
            System.out.print(" ");
        for (int col = 1; col < sC; col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
