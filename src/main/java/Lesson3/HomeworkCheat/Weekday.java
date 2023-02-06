package Lesson3.HomeworkCheat;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    boolean isWeekDay()
    {
        return this.ordinal() < 5;
    }

    boolean isWeekend()
    {
        return !isWeekDay();
    }

}
