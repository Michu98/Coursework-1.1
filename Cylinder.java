/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

/**
 *
 * @author Michal
 */
public class Cylinder extends ThreeDShapes {

    private final double radius_1;
    private final double height_1;

    public Cylinder(String name, double radius, double height) {
        super(name, 0);
        radius_1 = radius;
        height_1 = height;
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm also a cylinder.");
    }

    @Override
    public double getSurfaceArea() {
        double surfaceArea = (Math.PI * 2.0 * height_1 * radius_1) + (Math.PI * radius_1 * radius_1 * 2.0);
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        double volume = (Math.PI * radius_1 * radius_1 * height_1);
        return volume;
    }

    @Override
    public double getArea() {
        return getSurfaceArea();
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
