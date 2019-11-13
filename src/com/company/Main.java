package com.company;

import com.company.twoD.*;
import com.company.twoD.Vector;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Point begin = new Point(0 , 0);
//        Point middle = new Point(3 , 0);
//        Point end = new Point(3 , 4);
//        Line line = new Line(begin , end);
//        System.out.println(line.length()); // length() work
//        Vector vector = new Vector(begin , end);
//        System.out.println(vector.length()); // length() work
//        Triangle triangle = new Triangle(begin , middle , end);
//        System.out.println(triangle.perimetr());
//        System.out.println(triangle.getAB().length());
//        System.out.println(triangle.getAC().length());
//        System.out.println(triangle.getBC().length());
//        System.out.println(triangle.area());
        Point A = new Point(0 , 0) ,B = new Point(0, 2) , C = new Point(2 , 2) , D = new Point(2 , 0);
        Rectangle rectangle =  new Rectangle(A , B , C , D);
        System.out.println(rectangle.getA());
        System.out.println(rectangle.getB());
        System.out.println(rectangle.getC());
        System.out.println(rectangle.getD());
        System.out.println("another rectangle");
        Rectangle anotherRectangle = new Rectangle( C , D , B , A);
        System.out.println(anotherRectangle.getA());
        System.out.println(anotherRectangle.getB());
        System.out.println(anotherRectangle.getC());
        System.out.println(anotherRectangle.getD());
    }
}
