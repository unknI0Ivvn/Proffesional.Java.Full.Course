package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

interface Filter{ //SAM - single access method
    boolean criteria(String string);//критерий
}
class MyFilter implements Filter{


    @Override
    public boolean criteria(String string) {
        return string.contains("r");
    }
}
public class Oysters {
    public static void main(String[] args) {
        String[] month = new String[]{"January","February","March","April","May",
                "June","July","August","September","October","November","December"
                };
        //создать реализацию интерфейса Filter
        //проверка на наличие буквы r
        //отфильтровать массив и распечатать месяцы когда можно есть устрицы
        Collection<String> result = filter( // вызов функции filter
               // new MyFilter(),//конкретный класс
//                new Filter(){ // анонимный внутренний класс
//                    @Override
//                    public boolean criteria(String string) {
//                        return string.contains("r");
//                    }
//
//                },
                string -> string.contains("r"), // лямбда-выражение
        new ArrayList<>(Arrays.asList("January","February","March","April","May",
                "June","July","August","September","October","November","December"))
        );
        System.out.println(result);
        //Архитектурный шаблон Command
    }
    public static Collection<String> filter(Filter f,Collection<String> strings)
    {
        List<String> ret = new ArrayList<>();
        for(String s:strings) //для всех строк из входной коллекции
            if(f.criteria(s)) //если строка соответсвует критерию
                ret.add(s); //добавим ее в выходную коллекцию
        return ret;
    }
}
