package Lesson9.HomeworkCheat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountryTester {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>(
                Arrays.asList("Andorra","Belize","Cayman","France","Argentina","Cuba","Sweden")
        );
        Set<String> words = new HashSet<>(
                Arrays.asList("Andorra","Canada","First","candy","Argentina","wood","parrot","Alan","Cuba")
        );
        //из words сохраним только то что есть в countries
        words.retainAll(countries);
        //удалим страны не соответсвующие критерию
        System.out.println(words);
        for(String s:words)
        {
            //можем удалить что-то из HashSet только через итератор по которому проходим
//            if(!s.toUpperCase().startsWith("A"))//foreach - проход по итератору
//                words.remove(s);
        }
        Iterator<String>i=words.iterator();
        while(i.hasNext())
        {
            if(!i.next().toUpperCase().startsWith("A"))
                i.remove();
        }
        System.out.println(words);
    }
}
