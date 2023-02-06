package Lesson4.animals;

public class Dog extends Animals{
    public Dog(String name){
        super(name);
    }
    @Override
    public String greets() {
        return "Gaf";
    }
    public String greets(Dog another)
    {
        return "GafGaf";
    }
}
