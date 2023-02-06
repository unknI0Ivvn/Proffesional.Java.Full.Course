package Lesson4.HomeworkCheat;

import Lesson4.lines.Figure;
import Lesson4.lines.Point;

import java.util.List;

public class RectangleRepeat implements Figure {
    private List <Point> points;

    public RectangleRepeat(List<Point> points)
    {
        this.points=points;
    }

//    private double getLength(Point p0,Point p1)
//    {
//        return Math.sqrt(Math.pow(p1.getX()-p0.getX(),2))
//                + Math.sqrt(Math.pow(p1.getY()-p0.getY(),2));
//    }

    @Override
    public double getLength() {
        double l = 0;
        for (int i = 0; i < points.size() ; i++) {
            if(i !=points.size()-1)
                l +=points.get(i).getLength(points.get(i+1));
            else
                l+=points.get(i).getLength(points.get(0));

        }
        return l;
    }


}
