package com.company.twoD;

public class Vector extends Line {
    public Vector(Point begin, Point end) {
        super(begin, end);
    }
    public double dot(){
        return begin.getX()*end.getX() + begin.getY() * end.getY();
    }
}
