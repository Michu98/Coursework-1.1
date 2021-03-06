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
public abstract class Shape {
    
    private final int noOfSides;
    private final String name;
    public int getNoOfSides()
    {
        return noOfSides;
    }
    public Shape (String name, int noOfSides)
    {
        this.name = name;
        this.noOfSides = noOfSides;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getName()
    {
        return name;
    }
    public void displayDescription() {
        System.out.println("I'm a shape named " + name);
    }
}
   


