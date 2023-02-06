package Lesson4.animals;

public class BigDog extends Dog {


    public BigDog(String name) {
        super(name);
    }
    @Override
    public String greets()
    {
        return "GAF";
    }

    @Override
    public String greets(Dog another)
    {
        return "GAFGAF";
    }


    String greets(BigDog another)
    {
        return "GAFGAFGAF";
    }



}
