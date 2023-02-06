package Lesson3.Enums.cards;

import java.util.Random;

public class Dealer {
    private Random r = new Random();
    public Cards getCard()
    {
        int rank = r.nextInt(13);//генерирует псевдочлусайное числло в диапазоне от 0 до 12
        int suite = r.nextInt(4);
        return new Cards(
                Rank.values()[rank], // values ()метод из перечисления это масив всех элементов перечисления от  0
                Suite.values()[suite] // возвращающий массив всех элементов
        );

    }
}
