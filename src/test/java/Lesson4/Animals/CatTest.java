package Lesson4.Animals;

import Lesson4.animals.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void testCat()
    {
        Cat c = new Cat("Murzik");
        assertEquals("Meow",c.greets());

    }
}
