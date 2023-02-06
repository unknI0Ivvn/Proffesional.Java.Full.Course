package Lesson2.Inheretance;

public class Student extends Person {
    private String program;
    private int year;

    public Student(String name, String address, String program, int year) {
        super(name, address); // часть отвечающую за персону вызов конструктора супер класса
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return String.format("Student[name=%s,address=%s,year=%d",getName(),getAddress(),getProgram(),getYear());
    }
}
