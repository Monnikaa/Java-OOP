package _2ExercisesWorkingWithAbstraction._1CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Card Suits: ");
        for (CardSuit cs : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cs.ordinal(),cs);
        }
    }
}
