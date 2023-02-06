package Lesson4.reference;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        boolean a;// false
        long b;//0

        //boolean int float long short byte ...
        //хранятся в стеке функции
        //хип это тдель ная память общего процесса
        // стек это быстрая память ее есть ограничеенное количество
        //референсые типы = ссылочные титпы = reference types
        //Class [] @Test interface enum String
        //Все ссылочные типы с большой буквой
        //в чем разница между примитивными типами и ссылочными
        // у примитивов есть ссылка (boolean)
        // для других примтивных типов присвоится 0;
        //String c;
        //Sout(c)
        //по умолчанию 0 то есть ссылка на что то но пока ничего нет
        //свойство примитинвым типов оно преедается по значение

        String c = null ;
        Person p = new Person("Max"); // p = stack const
        System.out.println(c);

        // int double boolean
        //Interger Double Boolean
        int t = 50;
        Integer a1 = new Integer(t);
        Integer a2 = t;//boxing // инициализация ссылочного типа по примитивному

        List<Integer> intList = new ArrayList<>();
        if(a2<200) // unboxing - сравнение ссылочного типа с примтивным
        {
            System.out.println("Its less");
        }

        if(a1 == a2) // эквиваленость для ссылочных сравнивает их по адреасу в памяти
            //указываюли ли эти ссылки на один и тот же обьект
            System.out.println("==");
        else
            System.out.println("!=");

        if(a1.equals(a2))
            System.out.println("equals");
        else
            System.out.println("not equals");
    }
}

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}