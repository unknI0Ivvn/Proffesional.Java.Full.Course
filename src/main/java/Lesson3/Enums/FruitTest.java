package Lesson3.Enums;

public class FruitTest {
    public static void main(String[] args) {
        Fruits f = Fruits.BANANA;

        System.out.println(f.toString()); // BANANA

        System.out.println(f.ordinal());

        Fruits a = Fruits.valueOf("APRICOT");
        Fruits a1 = Fruits.APRICOT;
        System.out.println(a1.getCalories());
        Fruits.values();
    }
}
