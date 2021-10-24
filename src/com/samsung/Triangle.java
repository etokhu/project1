package com.samsung;

import com.samsung.Figure;

import java.awt.*;

public class Triangle implements Figure {
    Point point1, point2, point3;
    Color color;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    private double getLength(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    @Override
    public void move(double deltaX, double deltaY) {
        point1.move(deltaX, deltaY);
        point2.move(deltaX, deltaY);
        point3.move(deltaX, deltaY);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    public double getSurface(){
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point1, point3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter(){
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point1, point3);
        return a + b + c;
    }

    public boolean isIsoceles(){
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point1, point3);
        return (a == b || a == c) || b == c;
    }

    public boolean estEquilateral(){
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point1, point3);
        return a == b && a == c;
    }

    public boolean isRectangle(){
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point1, point3);
        return a * a == b * b + c * c;
    }

}
