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
}
