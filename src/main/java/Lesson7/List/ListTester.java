package Lesson7.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        //Irerators and Iterable
        //Foreach syntex

        int [] a = {10,20,30,40};
        List<Integer> b = Arrays.asList(10,20,30,40);
        for (int i = 0; i < a.length; i++) {
            System.out.println("fori "+a[i]);

        }
        for (int i :a)
        {
            System.out.println("foreach: "+i);
        }

        MyList list = new MyListSimpleImplementation();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list:"+list.get(i));

        }
        //итератор - указывает на конкретный элемент контейнера
        //операции:
        //boolean hasNExt() - если ли следующий элемент
        //int next() - получить значение элемента и сделать следующий элемент "текущим"
        Iterator<Integer> myIterator = list.iterator();
        while (myIterator.hasNext())
        {
            System.out.println("iterator next:"+myIterator.next());
        }

        for (int i: list) //iterrable
        {
            System.out.println("MyList..."+i);
        }

        }
    }

