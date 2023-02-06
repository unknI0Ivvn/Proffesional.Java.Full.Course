package Lesson2.HomeworkCheat.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private List<Pizza> pizzas =new ArrayList<>();
    public void add(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public int calcTotalPrice()
    {
        int sum = 0;
        for (int i = 0; i < pizzas.size(); i++) {
//            Pizza p = pizzas.get(i);
//            sum+=calcTotalPrice();
            sum+=pizzas.get(i).calcPrice();

        }
        return sum;
    }

}
