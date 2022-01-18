package ru.vol.sandbox;
import static java.lang.Math.sqrt;


public class Program {

    public static void main(String[] args) {
        //Создаем два объекта класса Point - две точки на плоскости
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);
        //Вызываем функцию для нахождения расстояния между точками
        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString() + ") = " + distance(p1, p2));
        //Вызываем метод для нахождения расстояния между точками
        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString() + ") = " + p1.distance(p2));
    }

    //Функция для нахождения расстояния между точками
    public static double distance(Point p1, Point p2) {
        return sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

}
