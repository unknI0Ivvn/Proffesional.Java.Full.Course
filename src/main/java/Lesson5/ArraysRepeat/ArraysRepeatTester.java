package Lesson5.ArraysRepeat;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysRepeatTester {
    public static void main(String[] args) {
        //Working with Arrays in Java.Binary Search.Sort.
        //инициализация
        int [] a = new int []{1,3,5,7};
        String [] b = {"Apocalypse now","Taxi Driver","Psycho"};
        double [] c = new double[10]; // 0 для всех кроме boolean(false)
        //ссылочные типы иницилизируется null

        //длина
        System.out.println(b.length);

        //обращение по индексу
        System.out.println(b[1]);

        //изменение по индексу
        b[2] = "Hatefull eight";


        //сортировка
        Arrays.sort(b, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println(Arrays.toString(b));

        //binarySearch
        // мы можем использовать двоинчый поиск только на отсортированном масиве
        //0 1  2 3 4 5 6
        // 1 4 13 33 37 41 50
        int [] r = {1,4,13,33,37,41,50};
        System.out.println(
                Arrays.binarySearch(r,41)
        );
    }
}
