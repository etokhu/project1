package com.samsung;

import com.samsung.Figure;

import java.awt.*;

public class Point implements Figure {
    double x, y;
    Color color;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point another){
        x = another.x;
        y = another.y;
        color = another.color;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    public double distanceTo(Point another){
        return(Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y)));
    }

    public double distanceToX(Point another){
        return (x - another.x);
    }

    public double distanceToY(Point another){
        return (y - another.y);
    }
}
