package Lesson4.Card;

public class CardTester {
    public static void main(String[] args) {
        Card.CardStatus status = Card.CardStatus.ORDERED;
        System.out.println(status.isOrdered());

        Card.CardStatus d = Card.CardStatus.DELIVERED;

        Card card = new Card();
        card.setStatus(Card.CardStatus.ORDERED);
        System.out.println(card.isDeliverable());
    }
}
