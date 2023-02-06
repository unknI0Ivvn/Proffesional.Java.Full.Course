package Lesson3.Figure;

public class Rectangle extends FigureAbstract {
    double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea()
    {
        return height*width;
    }
    public double getPerimetr()
    {
        return 2*(width+height);
    }
}
