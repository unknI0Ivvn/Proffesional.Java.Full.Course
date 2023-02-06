package Lesson4.animals;

public abstract class Animals {
    private String name;

    public Animals(String name) {

    }

//    public Animals(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    abstract String greets();
}
