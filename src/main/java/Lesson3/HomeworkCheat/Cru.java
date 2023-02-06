package Lesson3.HomeworkCheat;

public enum Cru {
    BASE(80),
    PREMIER(90),
    GRAND(100);
    Cru(int quality)
    {
        this.quality = quality;
    }
    private int quality;

    public int getQuality()
    {
    return quality;
    }
}
