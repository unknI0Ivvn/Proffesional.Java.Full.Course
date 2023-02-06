package Lesson4.Card;

public class Card {
    private String holder;
    private double balance;
    private CardStatus status;

    public enum CardStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED(0) {
            @Override
            public boolean isDelivered() {
                return true;
            }
        };


        private int timeToDelivery;
        public int getTimeToDelivery(){return timeToDelivery;}
        public boolean isReady() {return false;}
        public boolean isOrdered(){return false;}
        public boolean isDelivered(){return false;}

        CardStatus(int timeToDelivery)
        {
            this.timeToDelivery = timeToDelivery;
        }

    }//окончание CardStatus

    public boolean isDeliverable()
    {
        return status.isReady();
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }


} //окончание Card
