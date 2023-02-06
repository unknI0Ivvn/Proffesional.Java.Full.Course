package Lesson2.HomeworkCheat.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaTester {
    public static void main(String[] args) {
//        List l = new ArrayList();
//        l.add(123);
//        l.add("Hello");
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello World");
        System.out.println(stringList.size());
        System.out.println(stringList.get(0));
        stringList.remove(0);
        System.out.println(stringList.size());


        PizzaOrder order = new PizzaOrder();
        order.add(new Pizza("small",1,0,1));
        order.add(new Pizza("large",0,0,1));
        order.add(new Pizza("medium",0,2,0));

        order.add(new Pizza("XXL",3,4,5));

        System.out.println(order.calcTotalPrice());



    }
}
