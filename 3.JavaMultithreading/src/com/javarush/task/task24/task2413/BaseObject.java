package com.javarush.task.task24.task2413;

public abstract class BaseObject {
    private double x, y, radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    abstract public void draw(Canvas canvas);

    abstract public void move();

    boolean isIntersec(BaseObject o) {
        double sx = (x - o.x);
        double sy = (y - o.y);
        double length = Math.hypot(sx,sy);
        return length < Math.max(radius,o.radius);}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
