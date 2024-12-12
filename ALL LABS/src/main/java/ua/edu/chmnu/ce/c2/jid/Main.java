package ua.edu.chmnu.ce.c2.jid;
// Базовий клас
abstract class Shape {
    // Абстрактні методи для обчислення площі та периметра
    public abstract double area();
    public abstract double perimeter();
}

// Клас для кола
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Клас для прямокутника
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Клас для трикутника
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        // Приклад: припустимо, що трикутник рівнобічний
        return 3 * base;
    }
}

// Головний клас для демонстрації поліморфізму
public class Main {
    public static void main(String[] args) {
        // Створення масиву фігур
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(3, 4) };

        // Виклик методів для кожної фігури
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        }
    }
}
