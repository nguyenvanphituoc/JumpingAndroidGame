package com.badlogic.androidgames.framework.gamedev2d.math;

/**
 * Created by dell on 8/5/2016.
 * nguyen van phi tuoc
 */
public class Rectangle {
    public final Vector2 lowerLeft;
    public float width, height;

    public Rectangle(float x, float y, float width, float height) {
        this.lowerLeft = new Vector2(x, y);
        this.width = width;
        this.height = height;
    }

    public boolean overlapRectangles(Rectangle r1, Rectangle r2) {
        return r1.lowerLeft.x < r2.lowerLeft.x + r2.width &&
                r1.lowerLeft.x + r1.width > r2.lowerLeft.x &&
                r1.lowerLeft.y < r2.lowerLeft.y + r2.height &&
                r1.lowerLeft.y + r1.height > r2.lowerLeft.y;
    }

    public boolean overlapCircleRectangle(Circle c, Rectangle r) {
        double closestX = c.center.x;
        double closestY = c.center.y;
        if (c.center.x < r.lowerLeft.x) {
            closestX = r.lowerLeft.x;
        } else if (c.center.x > r.lowerLeft.x + r.width) {
            closestX = r.lowerLeft.x + r.width;
        }
        if (c.center.y < r.lowerLeft.y) {
            closestY = r.lowerLeft.y;
        } else if (c.center.y > r.lowerLeft.y + r.height) {
            closestY = r.lowerLeft.y + r.height;
        }
        return c.center.distSquared(closestX, closestY) < c.radius * c.radius;
    }
}