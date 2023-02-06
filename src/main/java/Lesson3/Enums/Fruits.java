package Lesson3.Enums;

public enum Fruits {
    APPLE(52), PEAR(55), BANANA(89), GRAPES(67), APRICOT(26);
    private int calories;
    Fruits(int Calories)
    {
        this.calories=calories;
    }

    public int getCalories()
    {

        return calories;
    }
}
