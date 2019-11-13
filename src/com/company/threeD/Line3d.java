package com.company.threeD;

import com.company.twoD.Line;

public class Line3d extends Line {
    public Line3d(Point3d begin, Point3d end) {
        super(begin ,end);
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2) );//wrong shit
    }
}
