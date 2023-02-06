package Lesson3.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3);
        r.setMaterial("Carton");


        List <FigureAbstract> figures = new ArrayList<>();
        figures.add(new Rectangle(2,3));
        figures.add(new Ellipse(2,3));

        double perimetr = 0;
        double area = 0;
        double price =0;
        for (int i = 0; i < figures.size(); i++) {
            perimetr+=figures.get(i).getPerimetr();
            area+= figures.get(i).getArea();
            price+= figures.get(i).calcPrice();
        }
        System.out.println("area:"+area);
        System.out.println("perimetr:"+perimetr);



//        List<Rectangle> rectangles = new ArrayList<>();
//        rectangles.add(new Rectangle(2,3));
//        rectangles.add(new Ellipse(2,3));

        System.out.println(figures.size());
        System.out.println(figures.get(0));
    }
}
