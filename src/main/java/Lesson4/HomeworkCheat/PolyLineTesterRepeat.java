package Lesson4.HomeworkCheat;

import Lesson4.lines.Point;

import java.util.ArrayList;

public class PolyLineTesterRepeat {
    public static void main(String[] args) {
        PolyLineRepeat p= new PolyLineRepeat(new ArrayList<Point>());
        p
                .appendPoint(new Point(0,0))
                .appendPoint(new Point(1,0))
        ;
        System.out.println(p);
    }
}
