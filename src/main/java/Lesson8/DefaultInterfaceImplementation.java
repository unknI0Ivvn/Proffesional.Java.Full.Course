package Lesson8;

public class DefaultInterfaceImplementation implements DefaultInterfaceTest{

    @Override
    public void SayHello() {
        System.out.println("Hello");

    }

    @Override
    public void introduce() {
        System.out.println("introduce");
    }
}
