package Lesson5.json;

import Lesson4.lines.Point;
import com.google.gson.Gson;

public class JsonTesterRepeat {
    public static void main(String[] args) {
        //обьект -> текст = сериализация serialization
        //текст - > обьект = десериализация(парсинг)

        Point p = new Point(33,44);

        Gson gson = new Gson();

        String s = gson.toJson(p);
        System.out.println(s);
        //JSON = JavaScript Object Notation

        String strinPoint = "{'x':10,'y':20}";

        //<point><x>10</x><y>20</y></point>
        //<point x =10 y = 10/>

       Point pp =  gson.fromJson(strinPoint, Point.class);

        System.out.println(pp.getX()+" "+pp.getY());

    }
}
