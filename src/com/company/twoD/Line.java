package com.company.twoD;

public class Line {
    protected Point begin;
    protected Point end;

    public Line(Point first, Point second) {
        begin = first;
        end = second;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length(){
        return Math.sqrt(Math.pow(end.getX() - begin.getX() , 2) + Math.pow(end.getY() - begin.getY() , 2));
    }

    public static boolean equl(Line first , Line second){
        return Point.equal(first.getBegin() , second.getBegin()) && Point.equal(first.getEnd() , second.getEnd());
    }

    public static double findAngle(Line firstLine , Line secondLine){
        Vector firstVector = new Vector(firstLine) , secondVector = new Vector(secondLine);
        return Vector.findAngle(secondVector , firstVector);
    }
    @Override
    public String toString() {
        return "Line(" +
                "begin = " + begin + " " +
                "end = " + end;
    }
}
