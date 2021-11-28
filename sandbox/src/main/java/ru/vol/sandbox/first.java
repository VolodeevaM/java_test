package ru.vol.sandbox;

public class first {

    public static void main(String[] args) {
        System.out.println("hello");

        Square s = new Square(5);
        System.out.println("Площадь");

        Point p1 = new Point(1, 3, 1, 3);

        System.out.println("Расстояние" + distance (p1));
    }

    public static double area(Square s) {
        return s.l*s.l;
    }

    public static double distance (Point p1) {
        return Math.sqrt((p1.x2 - p1.x1) * (p1.x2 - p1.x1) + (p1.y2 - p1.y1)*(p1.y2 - p1.y1));
    }


}