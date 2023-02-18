package Lesson10.hs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {
        //если мы планируем использовать хэшированные контейнеры
        //нужно в нашем классе заимплементить equals() и hashCode()
        //у Object.hasCode() есть контракт
        //1.На протяжение жихни обьекта hashCode() для него должен выдавать один и тот же int
        //2.если o1.equals(o2) to o1.hashCode() == o2.hashCode()
        //то чтоo1.hashCode*() == o2.hashCode() НЕ означает,что o1.equals(o2)!!!
        //Vasys - > 239
        //Vasya - > 239

        //Petya - > 10
        //Masha - > 10
        //У класса экземпляры которого сохраняются в хэш контейнерах
        //должны быть определены hashCode() и equals()
        Set<Point> points = new HashSet<>();
        points.add(new Point(10, 20));
        points.add(new Point(10, 20));

        System.out.println(points);
        //Нелья менять состояние обьектров хранящихся в
        //хэш контейнерах

        Set<Point> newPoints = new HashSet<>();
        Point p = new Point(10,20);
        newPoints.add(p);
        p.setX(1000);
        p.setY(1000);
        newPoints.add(p);
        System.out.println(newPoints);

        points.add(new Point(2,2));
        points.add(new Point(2000,2000));
        System.out.println(points); //при использовании HashSet никакой порядок обхода
        //не гарантируется

        System.out.println(points.contains(new Point(2000,2000)));

        Set<Point> linkedPoints = new LinkedHashSet<>();
        linkedPoints.add(new Point(10,20));
        linkedPoints.add(new Point(2,2));
        linkedPoints.add(new Point(2000,2000));
        System.out.println(linkedPoints); //в LinkedHashSet гарантируется возвращение обьектов
        //в порядке вставки

        Set<Point> TreePoints = new TreeSet<>(/*new PointComparator()*/);
        linkedPoints.add(new Point(10,20));
        linkedPoints.add(new Point(2,2));
        linkedPoints.add(new Point(2000,2000));
        System.out.println(TreePoints); // TreeSet гарантирует возвращение обьектов в порядке сортировки
        //определенном для класса либо через Comparable, либо через Comparator

    }
}
