package com.samsung;

import com.samsung.Figure;

import java.awt.*;

public class Rectangle implements Figure {
    Point beginPoint;
    double edgeX, edgeY;
    Color color;

    public Rectangle(Point beginPoint, double edgeX, double edgeY) {
        this.beginPoint = beginPoint;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    @Override
    public void move(double deltaX, double deltaY) {
        beginPoint.move(deltaX, deltaY);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                ", beginPoint=" + beginPoint +
                ", color=" + color +
                '}';
    }

    double getSurface(){
        return edgeX * edgeY;
    }

    double getPerimeter(){
        return 2 * (edgeX + edgeY);
    }
}
