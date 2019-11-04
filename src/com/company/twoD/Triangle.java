package com.company.twoD;

public class Triangle {
    private Point A,
            B,
            C;
    private Line AB,
            AC,
            BC;

    public Triangle(Point first, Point second, Point third) {
        A = first;
        B = second;
        C = third;
        AB = new Line(A , B);
        AC = new Line(A , C);
        BC = new Line(B , C);
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public Line getAB() {
        return AB;
    }

    public void setAB(Line AB) {
        this.AB = AB;
    }

    public Line getAC() {
        return AC;
    }

    public void setAC(Line AC) {
        this.AC = AC;
    }

    public Line getBC() {
        return BC;
    }

    public void setBC(Line BC) {
        this.BC = BC;
    }

    public  double perimetr(){
        return AB.length() + BC.length() + AC.length();
    }

    public double area(){
        double halfPerimetr = perimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - AB.length()) * (halfPerimetr - AC.length()) * (halfPerimetr - BC.length()));
    }

}
