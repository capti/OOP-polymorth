package ru.vsu.cs;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Circle(3.0);


        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Площадь: " + area);
        }
    }
}
