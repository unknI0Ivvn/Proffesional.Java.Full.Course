package Lesson3.Enums.cards;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Casino {
    public static void main(String[] args) {
        Dealer d = new Dealer();
        Scanner s = new Scanner(System.in);
        List<Cards> deck = new ArrayList<>();
        do {
            Cards cards = d.getCard();
            deck.add(cards);
            System.out.println("Карта" + cards);
            int score = 0;
            for (int i = 0; i < deck.size(); i++) {
                score += deck.get(i).getValue();

            }
            System.out.println("Ваш счет" + score);
            System.out.println("Нажмите N для прекращение игры ");
        } while (!s.next().equals("N"));
    }
}
