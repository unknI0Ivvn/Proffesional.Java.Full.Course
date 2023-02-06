package Lesson6.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AddressListTest {
    @Test
    public void testGetAddresses()
    {
        List<Address> res = Arrays.asList(
                new Address("Main Street","12"),
               new Address("Fleet street","1"),
              new Address("Light Street","44")
        );

        List<Person> people = new ArrayList<>();
        people.add(new Person("Maria Ivniva", new Address("Light Street","44").toString()));
        people.add(new Person("Max Kotkov", new Address("Main Street","12").toString()));
        people.add(new Person("Semen Petrov", new Address("Fleet street","1").toString()));

assertEquals(res,Tester.getAddresses(people));
    }
}
