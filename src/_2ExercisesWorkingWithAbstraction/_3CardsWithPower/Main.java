package _2ExercisesWorkingWithAbstraction._3CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rankCard = sc.nextLine();
        String suitCard = sc.nextLine();

        RankPowers rankPowersEn = RankPowers.valueOf(rankCard);
        SuitPowers suitPowersEn = SuitPowers.valueOf(suitCard);

        Cart c = new Cart(rankPowersEn, suitPowersEn);
        c.Print();
    }
}
