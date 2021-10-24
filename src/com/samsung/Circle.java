package com.samsung;

import com.samsung.Figure;

import java.awt.*;

public class Circle implements Figure {
    Point beginPoint;
    double radius;
    Color color;

    public Circle(Point beginPoint, double radius) {
        this.beginPoint = beginPoint;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "beginPoint=" + beginPoint +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }

    @Override
    public void move(double deltaX, double deltaY) {
        beginPoint.move(deltaX, deltaY);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getSurface(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
}
