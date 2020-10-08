package best.programming;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------CIRCLE----------");
        System.out.print("Give me a circle radius length: ");
        double circleRadiusLen = scanner.nextDouble();
        System.out.println("---------TRIANGLE---------");
        System.out.print("Give me a first side length (side at right angle): ");
        double triangleSide1 = scanner.nextDouble();
        System.out.print("Give me a second side length (side at right angle): ");
        double triangleSide2 = scanner.nextDouble();
        System.out.println("---------RECTANGLE--------");
        System.out.print("Give me a first side length: ");
        double rectangleSide1 = scanner.nextDouble();
        System.out.print("Give me a second side length: ");
        double rectangleSide2 = scanner.nextDouble();

        List<Figure> figures = new ArrayList<>();

        Circle circle = new Circle(circleRadiusLen);
        Triangle triangle = new Triangle(triangleSide1, triangleSide2);
        Rectangle rectangle = new Rectangle(rectangleSide1, rectangleSide2);

        figures.add(circle);
        figures.add(triangle);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println("===" + figure.getClass().getSimpleName() + "===");
            System.out.println("Perimeter: " + figure.getPerimeter());
            System.out.println("Area: " + figure.getArea());
        }
    }
}
