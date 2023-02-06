package Lesson6.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Max Kotkov", new Address("Main Street","12").toString()));
        people.add(new Person("Semen Petrov", new Address("Fleet street","1").toString()));
        people.add(new Person("Maria Ivniva", new Address("Light Street","44").toString()));

        //не сможем увлеичить созданный таким образом List так как он основан на array
        System.out.println(getAddresses(people));

        List<String> s = Arrays.asList("Max","Smith","Tandy","Roger","Michael","Alexandra");
        System.out.println(
                filter4(s,4)
        );

        for(Address a:getAddresses(people))
        {
            System.out.println(a);
        }

        //Инструкция
        //https://docs.oracle.com/javase/8/docs/api/java/util/List.html

        //создание - new "реализация"
        //доступ по индексу get(i)
        //добавление add(Person( add(i,Person)
        //изменение set(i,person)
        //удаление remove(i) remove(Person)
        //размер size()


    }

    //напишите функция которая принимает на вход список строк и возврщается список строк
    //длиной более заданной
    //пример если передать список строк и 4 вернутся строки длиной больше 5
    public static List<String> filter4(List<String>names,int number)
    {
        List<String> r = new ArrayList<>();
        for (String s:names)
        {
            if(s.length()>number)
                r.add(s);
        }
        return r;
    }
    //Напишите функцию которая получает на вход список персон и возвращает список адресов жтих персон
    public static List<Address> getAddresses(List<Person> persons)
    {
        List<Address> addresses = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            addresses.add(p.address);

        }
        return addresses;
    }
}
