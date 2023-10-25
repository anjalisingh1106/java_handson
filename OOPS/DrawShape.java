package OOPS;

abstract class Shape {
    abstract void draw();
}

class Line extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Line");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Cube extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Cube");
    }
}

public class DrawShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Line();
        shapes[1] = new Rectangle();
        shapes[2] = new Cube();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}