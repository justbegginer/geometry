package com.company.twoD;

public class Point {
    private double x;
    private double y;

    public Point(Point point) {
        y = point.getY();
        x = point.getX();
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static boolean equal(Point first, Point second) {
        return first.getX() == second.getX() && first.getY() == second.getY();
    }

    @Override
    public String toString() {
        return "Point " +
                "x=" + x +
                "y=" + y;
    }

}
