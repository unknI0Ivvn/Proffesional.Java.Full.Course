package Lesson8.list;

import Lesson8.Doublelinkedlist;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DoubleLinkedListTester {
    @Test
    public void testadd()
    {
        Doublelinkedlist l = new Doublelinkedlist();
        l.add(10);
        l.add(20);
        assertEquals("[10, 20]",l.toString());
        assertEquals(10,l.get(0));
        l.set(1,30);
        assertEquals(30,l.get(1));

    }

    public void testAddPosition()
    {
        Doublelinkedlist l = new Doublelinkedlist();
        l.add(0,10);
        l.add(0,20);
        l.add(0,30);
        assertEquals("[10,20,30]",l.toString());
    }
    @Test
    public void testRemove()
    {
        Doublelinkedlist l = new Doublelinkedlist();
        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(1);
        assertEquals("[10, 30]",l.toString());
        l.remove(1);
        assertEquals("[10]",l.toString());
        l.remove(0);
        assertEquals("[]",l.toString());

    }
}
