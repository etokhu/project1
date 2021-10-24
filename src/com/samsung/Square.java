package com.samsung;

import java.awt.*;

public class Square extends Rectangle{
    Point beginPoint;
    double edge;
    Color color;

    public Square(Point beginPoint, double edge) {
        super(beginPoint, edge, edge);
    }

    @Override
    public String toString() {
        return "Square{" +
                "beginPoint=" + beginPoint +
                ", edge=" + edge +
                ", color=" + color +
                '}';
    }

    public void move(double deltaX, double deltaY){
        super.move(deltaX, deltaY);
    }

    public void setColor(Color c){
        super.setColor(c);
    }

    public double getSurface(){
        return super.getSurface();
    }

    public double getPerimeter(){
        return super.getPerimeter();
    }
}
