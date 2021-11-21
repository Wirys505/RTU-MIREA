package Labs.Lab5;

import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    int x,y,w,h,r,g,b;
    public Shape() {
        this.x = (int) (Math.random() * 120);
        this.y = (int) (Math.random() * 70);
        this.w = (int) (Math.random() * 40) + 10;
        this.h = (int) (Math.random() * 40) + 10;
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getG() {
        return g;
    }
    public void setG(int g) {
        this.g = g;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
   /* Shape(Graphics shape){
        setPos(shape);
        setColor(shape);
    }
    void setPos(Graphics shape){
        int x = (int) (Math.random() * 140);
        int y = (int) (Math.random() * 90);
        int w = (int) (Math.random() * 40);
        int h = (int) (Math.random() * 40);
        shape.fillRect(x,y,w,h);
    }
    void setColor(Graphics shape){
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        shape.setColor(new Color(r, g, b));
    }*/
}