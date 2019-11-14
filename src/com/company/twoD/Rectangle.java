package com.company.twoD;

public class Rectangle extends Triangle {
    private Line AD,
            BD,
            CD;
    protected Point D;

    public Rectangle(Point first, Point second, Point third, Point fourth) {
        super(first, second, third);
        D = fourth;
        makeRightPointsCoordinates();
        makeSides();
    }

    public Point getD() {
        return D;
    }

    public void setD(Point d) {
        D = d;
        makeSides();
    }

    private void makeRightPointsCoordinates() {
        // make right sides like : AB - side , not diagonal ; AC - diagonal , not side
        // so A - the leftmost point(have the smallest x coordinate) , than D - the rightmost point
        Point[] allPoints = {getA(), getB(), getC(), getD()};
        for (int i = 1; i < allPoints.length; i++) {
            if (allPoints[i - 1].getX() > allPoints[i].getX() ||
                    (allPoints[i-1].getX() == allPoints[i].getX() &&
                    allPoints[i-1].getY() > allPoints[i].getY())) {
                //Point second = allPoints[i-1];
                //Point first = allPoints[i];
                //System.out.println("helloy");
                double intermidiateX = allPoints[i - 1].getX(), intermidiateY = allPoints[i - 1].getY();
                allPoints[i - 1] = new Point(allPoints[i].getX(), allPoints[i].getY());
                allPoints[i] = new Point(intermidiateX, intermidiateY);
                i = 0;
            }
        }
        setA(allPoints[0]);
        setB(allPoints[1]);
        setC(allPoints[2]);
        setD(allPoints[3]);
    }

    private void makeSides() {
        AB = new Line(getA(), getB());
        AC = new Line(getA(), getC());
        AD = new Line(getA(), getD());
        BC = new Line(getB(), getC());
        BD = new Line(getB(), getD());
        CD = new Line(getC(), getD());
    }

    @Override
    public double perimetr() {
        return AB.length() + BC.length() + CD.length() + AD.length();
    }
}
