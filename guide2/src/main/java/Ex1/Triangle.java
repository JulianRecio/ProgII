package Ex1;

import Ex3.Point2D;

public class Triangle {
    private Line ab;
    private Line bc;
    private Line ca;

    public Triangle(Point2D a, Point2D b, Point2D c) {
        ab = new Line(a, b);
        bc = new Line(b, c);
        ca = new Line(c, a);
    }


    public double area(){
        double base;
        double height;
        if(isEquilateral()){
            return calculateEquilateralArea();
        } else if (isScalene()) {
            return calculateScaleneArea();
        }else {
            return calculateIsoscelesArea();
        }
    }

    private double calculateIsoscelesArea() {
        double base = ab.calculateLine();
        double height = calculateHeight(base);
        return (base * height) / 2; // Fórmula del área del triángulo isósceles
    }

    private double calculateScaleneArea() {
        double semiperimeter = perimeter() / 2;
        double sideA = ab.calculateLine();
        double sideB = bc.calculateLine();
        double sideC = ca.calculateLine();
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC)); // Fórmula de Herón para el área del triángulo escaleno
    }

    private double calculateEquilateralArea() {
        double side = ab.calculateLine();
        return (Math.sqrt(3) / 4) * Math.pow(side, 2); // Fórmula del área del triángulo equilátero
    }

    public double perimeter(){
        return ab.calculateLine() + bc.calculateLine() + ca.calculateLine();
    }

    public boolean isIsoceles(){
        return ab.calculateLine() == bc.calculateLine() || bc.calculateLine() == ca.calculateLine() || ca.calculateLine() == ab.calculateLine();
    }

    public boolean isScalene(){
        return ab.calculateLine() != bc.calculateLine() && bc.calculateLine() != ca.calculateLine() && ca.calculateLine() != ab.calculateLine();
    }

    public boolean isEquilateral(){
        return ab.calculateLine() == bc.calculateLine() && bc.calculateLine() == ca.calculateLine();
    }

    private double calculateHeight(double base) {
        double heightSquared = Math.pow(ab.calculateLine(), 2) - Math.pow(base / 2, 2); // Teorema de Pitágoras para calcular la altura de un triángulo isósceles
        return Math.sqrt(heightSquared);
    }
}
