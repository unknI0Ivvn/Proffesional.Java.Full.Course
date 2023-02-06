package Lesson4.HomeworkCheat;

import Lesson4.lines.Figure;
import Lesson4.lines.Point;

import java.util.List;

public class PolyLineRepeat implements Figure {
    private List<Point> points;

    public PolyLineRepeat(List<Point> points) {
        this.points = points;
    }

    public PolyLineRepeat appendPoint(Point p)
    {
        points.add(p);
        return this;
    }


    @Override
    public double getLength() {
        double l = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            l+=points.get(i).getLength(points.get(i+1));

        }
        return l;
    }


    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("Polyline{");
        for (int i = 0; i < points.size(); i++) {
            b.append("\t");
            b.append(points.get(i));

        }
        b.append("}");
        return b.toString();
    }
}
