package Lesson3.Enums.cards;

public class Cards {
    private Rank rank;
    private Suite suite;

    public Cards(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }
    public int getValue()
    {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return "Cards{" +
                "rank=" + rank +
                ", suite=" + suite +
                '}';
    }
}
