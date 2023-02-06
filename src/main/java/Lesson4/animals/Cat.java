package Lesson4.animals;

public class Cat extends Animals {
    public Cat(String name){
        super(name);
    }
    @Override
    public String greets() {
        return "Meow";
    }
}
