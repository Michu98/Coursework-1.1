/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michal
 */
public class Clientv2 {

    static boolean exit;
    static Scanner s;
    static ArrayList<Shape> array;

    public static void main(String[] args) {
        while (true) {
            printMenu();
        }
    }

    public static void MenuExecutor() {
        while (!exit) {
            printMenu();
        }
    }
    
    private static void printMenu() {
        System.out.println("1) Create 2D Shape");
        System.out.println("2) Create 3D Shape");
        System.out.println("3) Exit");
        s = new Scanner(System.in);

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                TwoDMenu();
                break;
            default:

            case 2:
                ThreeDMenu();
                break;
        }
    }

    public static void TwoDMenu() {
        System.out.println("Please, Name your Shape: ");
        String name = s.next();

        System.out.println("What 2D Shape would you like to create?");

        System.out.println("Please enter the letter based on the shape you wish to create:");
        System.out.println("t for Triangle:");
        System.out.println("c for Circle:");
        System.out.println("r for Rectangle:");
        System.out.println("x for Exit");
        String first = s.next();

        switch (first) {
            case "t": {
                System.out.println("Please enter the dimension for your shape:");
                System.out.println("Dimension 1");
                double side1 = s.nextDouble();
                System.out.println("Dimension 2");
                double side2 = s.nextDouble();
                System.out.println("Dimension 3");
                double side3 = s.nextDouble();
                Triangle myTriangle = new Triangle(name, side1, side2, side3);
                System.out.println("Area:" + myTriangle.getArea());
                System.out.println("Perimeter:" + myTriangle.getPerimeter());
                System.out.println("Send " + name + " to the server?");
                System.out.println("y for yes, n for no");
                break;
            }
            case "c": {
                System.out.println("Please enter the dimension for your shape:");
                System.out.println("Enter the radius:");
                double radius = s.nextDouble();
                Circle myCircle = new Circle(name, radius);
                System.out.println("Area:" + myCircle.getArea());
                System.out.println("Perimeter:" + myCircle.getPerimeter());
                System.out.println("Send " + name + "to the server?");
                System.out.println("y for yes, nfor no");
                break;
            }
            case "r": {
                System.out.println("Please enter the dimension for your shape:");
                System.out.println("Rectangle Height:");
                int height = s.nextInt();
                System.out.println("Rectangle width:");
                int width = s.nextInt();
                Rectangle myRectangle = new Rectangle(name, height, width);
                System.out.println("Area:");
                System.out.println("Permeter:");
                System.out.println("Send " + name + "to the server?");
                System.out.println("y for yes, n for no");
                break;
            }
            default:
                break;
        }
    }

    public static void ThreeDMenu() {
        System.out.println("Please, Name your Shape: ");
        String name = s.next();

        System.out.println("What 3D Shape would you like to create?");

        System.out.println("Please enter the letter based on the shape you wish to create:");
        System.out.println("c for Cyliner:");
        System.out.println("s for Sphere");
        System.out.println("x for Exit");
        String first = s.next();

        switch (first) {
            case "c": {
                System.out.println("Please enter the dimension for your shape:");
                System.out.println("Dimension 1");
                double side1 = s.nextDouble();
                System.out.println("Dimension 2");
                double side2 = s.nextDouble();
                System.out.println("Dimension 3");
                double side3 = s.nextDouble();
                Triangle myTriangle = new Triangle(name, side1, side2, side3);
                System.out.println("Area:" + myTriangle.getArea());
                System.out.println("Perimeter:" + myTriangle.getPerimeter());
                System.out.println("Send " + name + " to the server?");
                System.out.println("y for yes, n for no");
                break;
            }
            case "s": {
                System.out.println("Please enter the dimension for your shape:");
                System.out.println("Radius:");
                double radius = s.nextDouble();
                Circle myCircle = new Circle(name, radius);
                System.out.println("Area:" + myCircle.getArea());
                System.out.println("Perimeter:" + myCircle.getPerimeter());
                System.out.println("Send " + name + "to the server?");
                System.out.println("y for yes, nfor no");
                break;
            }
        }
        switch (first) {
            case "x": {
                System.exit(0);
            }
        }
    }
}
