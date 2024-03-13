package _2ExercisesWorkingWithAbstraction._3CardsWithPower;

public class Cart {
    private RankPowers rankPowers;
    private SuitPowers suitPowers;


    public Cart(RankPowers rankPowers, SuitPowers suitPowers) {
        this.rankPowers = rankPowers;
        this.suitPowers = suitPowers;
    }
    public int getPower(){
        return rankPowers.getRank() + suitPowers.getSuit();
    }

    public void Print(){
        System.out.printf("Card name: %s of %s; Card power: %d", rankPowers, suitPowers, getPower());
    }
}
