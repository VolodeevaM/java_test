package ru.vol.sandbox;

public class DistanceApp {

        public static void main(String[] args) {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(10, 10);
            System.out.println("Растояние между двумя точками с координатами первой " +
                    p1 + " второй " + p2 + " = " + p1.getDistance(p2));

        }
    }

