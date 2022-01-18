package ru.vol.sandbox;



import static java.lang.Math.sqrt;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {

        return this.x + ";" + this.y;

    }

    public double distance(Point p) {
        return sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));

    }
}
