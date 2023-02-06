package Lesson2.HomeworkCheat.pizza;

public class Pizza {
    private String size;
    private int cheese,pepperoni,ham;

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public int calcPrice()
    {
        int price = 0;
        switch (size)

        {
            case"small":
                price+=10;
                break;
            case"medium":
                price+=12;
                break;
            case"large":
                price+=14;
                break;

        }
        price+=(pepperoni+cheese+ham)*2;
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", ham=" + ham +
                '}';
    }
}
