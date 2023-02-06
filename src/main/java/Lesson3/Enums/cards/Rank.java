package Lesson3.Enums.cards;

public enum Rank {
    DEUCE(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(2),QUEEN(3),KING(4),ACE(11);
    //добавить картам свойства
    private int value;


    Rank(int value)
    {
        this.value=value;
    }


    public int getValue()
    {

        return value;
    }
    }

