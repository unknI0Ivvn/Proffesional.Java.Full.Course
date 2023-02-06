package Lesson8;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        int [] l = {1,2,3};
        //iterator - это интерфейс
        //итератор позволяет обойти все элементы люого класса котороые имплементит Iterable I
        //Iterable набор функций который позволяет все обойти
        // это повторение
        //HashSet
        //TreeSet


        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Oxana");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        names.get(3);

        Set<String> countries = new HashSet<>();
        Set<String> capitals = new TreeSet<>();

        countries.add("Canada");
        countries.add("Germany");
        countries.add("Russia");
        Iterator<String> setIterator = countries.iterator();
        while (setIterator.hasNext())
            System.out.println(setIterator.next());





    }

}
