package Lesson1.Geometry;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRectangleArea {
    @Test
    public void testArea()
    {
        Rectangle rec = new Rectangle(
                new Point(1,1),
                new Point(5,5)
        );
        assertEquals(16,rec.getArea());
    }
}
