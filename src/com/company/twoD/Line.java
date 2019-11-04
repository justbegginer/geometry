package com.company.twoD;

public class Line {
    private Point begin;
    private Point end;

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

    @Override
    public String toString() {
        return "Line(" +
                "begin = " + begin + " " +
                "end = " + end;
    }
}
