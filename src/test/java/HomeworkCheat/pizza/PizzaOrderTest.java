package HomeworkCheat.pizza;

import Lesson2.HomeworkCheat.pizza.Pizza;
import Lesson2.HomeworkCheat.pizza.PizzaOrder;
import Lesson2.HomeworkCheat.pizza.PizzaTester;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PizzaOrderTest {
    @Test
    public void testSmallPizzaaWithCheese()
    {
        Pizza p = new Pizza("small",1,0,0);
        assertEquals(12,p.calcPrice());

    }
    @Test
    public void testPizzaOderWithAllKindsOfPizzaWithHam()
    {
        Pizza p1 = new Pizza("small",0,0,1);
        Pizza p2= new Pizza("medium",0,0,1);
        Pizza p3 = new Pizza("large",0,0,1);

        PizzaOrder po = new PizzaOrder();
        po.add(p1);
        po.add(p2);
        po.add(p3);
        assertEquals(42,po.calcTotalPrice());
    }
}
