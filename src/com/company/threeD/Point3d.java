package com.company.threeD;

import com.company.twoD.Point;

public class Point3d extends Point {
    protected double z ;
    public Point3d (double x , double y , double z){
        super(x , y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString(){
        return "";
    }
}
