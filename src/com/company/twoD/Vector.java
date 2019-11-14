package com.company.twoD;

public class Vector{
    private double x , y;
    public Vector(Point begin, Point end) {
        x = end.getX() -  begin.getX();
        y = end.getY() - begin.getY();
    }

    public Vector(Line line){
        Point begin = line.begin;
        Point end = line.end;
        x = end.getX() - begin.getX();
        y = end.getY() - begin.getY();
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

    public double length(){
        return Math.sqrt(x*x+y*y);
    }

    public static double dot(Vector first , Vector second){
        return first.getX()*second.getX() + first.getY()*second.getY();
    }

    public static double findAngle(Vector first , Vector second){
        //System.out.println(dot(first, second));
        double cosOfAngle = dot(first , second)/first.length() / second.length();
        System.out.println(cosOfAngle);
        return Math.acos(cosOfAngle)*57.3;
    }
}
