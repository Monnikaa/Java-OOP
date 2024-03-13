package _2ExercisesWorkingWithAbstraction._2CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Card Ranks: ");
        for(CardRank cr : CardRank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cr.ordinal(), cr);
        }
    }
}
