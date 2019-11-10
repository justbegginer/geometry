package com.company.twoD;

public class Triangle {
    private Point A,
            B,
            C;
    protected Line AB,
            AC,
            BC;

    public Triangle(Point first, Point second, Point third) {
        A = first;
        B = second;
        C = third;
        makeSides();
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
        makeSides();
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
        makeSides();
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
        makeSides();
    }

    private void makeSides(){
        AB = new Line(A , B);
        AC = new Line(A , C);
        BC = new Line(B , C);
    }
    protected void makeSides(Point point){

    }
    public Line getAB() {
        return AB;
    }

    public Line getAC() {
        return AC;
    }

    public Line getBC() {
        return BC;
    }


    public  double perimetr(){
        return AB.length() + BC.length() + AC.length();
    }

    public double area(){
        double halfPerimetr = perimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - AB.length()) * (halfPerimetr - AC.length()) * (halfPerimetr - BC.length()));
    }

}
