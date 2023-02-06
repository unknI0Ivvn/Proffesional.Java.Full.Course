package Lesson1.Homework;

import Lesson1.HomeworkCheat.Color;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestColor {
    @Test
    public void testMyColor()
    {
        Color c = new Color(0,255,255);
        assertEquals(180,c.getH(),0.01);
        assertEquals(1,c.getS(),0.01);
        assertEquals(0.5,c.getL(),0.01);
    }
}
