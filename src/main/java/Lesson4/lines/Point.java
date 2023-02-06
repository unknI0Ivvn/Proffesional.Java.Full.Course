package Lesson4.lines;

public class Point {
    private double x,y;

    //{"x":43,"y":12} - json

    //{"x":43,"y":12}


    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX()
    {
        return x;
    }
    public double getY(){
        return y;
    }

    /*
    public double getLength(Point p)
    {
        return Math.sqrt(Math.pow(p.getX()-getX(),2)+Math.pow(p.getY()-getY(),2));
    }

     */

    public double getLength(Point p)
    {
        return Math.sqrt(Math.pow(p.getX()-getX(),2)+Math.pow(p.getY()-getY(),2));
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //рефакторинг прцоесс позволдяет ищьалвяться от старого кодла делить их на куски боллее простых для подлержаивания
}
