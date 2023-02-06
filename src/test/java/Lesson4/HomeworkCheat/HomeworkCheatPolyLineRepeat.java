package Lesson4.HomeworkCheat;


import Lesson4.lines.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomeworkCheatPolyLineRepeat {
    @Test
    public void CheckRectangleRepeatLength()
    {
        List<Point>p = new ArrayList<>();
        p.add(new Point(0,0));
        p.add(new Point(1,0));
        p.add(new Point(1,1));
        p.add(new Point(0,1));
        PolyLineRepeat pl  = new PolyLineRepeat(p);
        assertEquals(3,pl.getLength(),0.001);

}
    }
