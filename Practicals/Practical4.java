package Practicals;

// This class is ShapeMain
// But for convenience of file naming it is named as Practical4
class Practical4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20, 20);
        System.out.println(triangle.calArea());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.calArea());

        Square square = new Square(10);
        System.out.println(square.calArea());

        // We can't create object of abstract class, but we can create
        // it's reference

        // Creating reference of Shape class
        Shape shape;
        shape = square;
        // Invoking calArea of sqaure class using shape as reference
        System.out.println(shape.calArea());

        double side = 10;
        Rectangle rect = new Rectangle(side, side);
        if (rect.isSquare()) {
            System.out.println(new Square(side).calArea());
        } else {
            System.out.println(rect.calArea());
        }

    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
}

// ================================
// Shape
// ================================
abstract class Shape {
    abstract double calArea();
}

// ================================
// Triangle
// ================================
class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    Triangle() {
        this.side1 = 10;
        this.side2 = 10;
        this.side3 = 10;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calArea() {
        // Heron's Formula for the area of a triangle is used here

        // Half of parameter
        double hP = (this.side1 + this.side2 + this.side3) / 2;

        // Area
        double area = Math.sqrt(hP * (hP - this.side1) * (hP - this.side2) * (hP - this.side3));
        return area;

        // If area == 0 then no such with the given sides is possible
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}

// ================================
// Rectangle
// ================================
class Rectangle extends Shape {
    double height;
    double width;

    Rectangle() {
        this.height = 10;
        this.width = 10;
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double calArea() {
        return this.height * this.width; // Area
    }

    boolean isSquare() {
        return this.height == this.width;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}

// ================================
// Square
// ================================
class Square extends Rectangle {
    Square() {
        super(10, 10); // Since in sqaure all sides are equal
    }

    Square(double side) {
        super(side, side); // Since in sqaure all sides are equal
    }

    double calArea() {
        return super.calArea();
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    //
}
