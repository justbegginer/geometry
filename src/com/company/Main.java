package com.company;

import com.company.twoD.Line;
import com.company.twoD.Point;
import com.company.twoD.Triangle;
import com.company.twoD.Vector;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Point begin = new Point(0 , 0);
        Point middle = new Point(3 , 0);
        Point end = new Point(3 , 4);
        Line line = new Line(begin , end);
        System.out.println(line.length()); // length() work
        Vector vector = new Vector(begin , end);
        System.out.println(vector.length()); // length() work
        Triangle triangle = new Triangle(begin , middle , end);
        System.out.println(triangle.perimetr());
        System.out.println(triangle.getAB().length());
        System.out.println(triangle.getAC().length());
        System.out.println(triangle.getBC().length());
        System.out.println(triangle.area());
    }
}
