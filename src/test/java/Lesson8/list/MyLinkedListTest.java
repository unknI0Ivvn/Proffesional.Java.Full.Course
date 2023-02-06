package Lesson8.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {
    @Test
    public void testLinkedList()
    {
        MyLinkedList l = new MyLinkedList();
        assertEquals(0,l.size());
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(3,l.size());

        assertEquals(3,l.size());
        assertEquals(3,l.get(2));
        assertTrue(l.contains(2));
        l.set(2,22);
        assertEquals(l.get(2),22);
        l.add(2,33);
        assertEquals("[1,2,33,22]",l.toString());

    }
}
