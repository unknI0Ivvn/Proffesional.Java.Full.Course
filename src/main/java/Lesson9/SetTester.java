package Lesson9;

import Lesson6.List.Tester;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {


    //Java Set IMplements.Exercises
    //применение сеток - проверка на уникальность
    //поиск дупликатов
    //Реалиация
    //HashSet - если правильно подобран алгоритм хэширования и парметры ъэщ то
    //операция получения значения из сета может быть 0(1)
    //LinkedHastSet - + при обходе по итератору !! элементы возвращаются в порядке вставки
    //TreeSet - при обходе по итератору элементы возвращаются в порядке сортировки

    Set<String> groups = new HashSet<>();
    groups.add("Abba");
        groups.add("Guns and Roses");
        groups.add("Peral Jam");
        groups.add("Abba");
        groups.add("Beatles");
        System.out.println(groups.size());
        System.out.println(groups.contains("Aerosmith"));
        //
        String [] gr =new String[groups.size()];
        groups.toArray(gr);
        for(String s:groups)
        {
            System.out.println(s);
        }
        TreeSet<String> tree = new TreeSet<>();
        //сложение
        tree.addAll(groups);
        for (String s:tree)
        {
            System.out.println(s);
        }
        //вычитание
        tree.removeAll(groups);

        //находятся ли все элементы сета в другом
        tree.containsAll(groups);

        //общие элементы в двух сетах
        tree.retainAll(groups);

        String [] words = new String[]{"One","Two","Three","Four","One","Five","Three"};
        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for(String w:words)
        {
            if(!unique.contains(w))
                unique.add(w);
        else
            duplicates.add(w);
        }
        System.out.println(duplicates);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(11);
        numbers.add(4);
        System.out.println(numbers.headSet(5));

//        numbers.add("One");
//        numbers.add("Two");
//        numbers.add("Three");
//        numbers.add("Four");
//        numbers.add("One");
//        numbers.add("Five");
//        numbers.add("Three");
//        System.out.println(numbers.size());
//        System.out.println(numbers.contains("One"));


    }


}
