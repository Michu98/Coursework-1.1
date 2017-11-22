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
 public abstract class TwoDShapes extends Shape {

    public TwoDShapes(String name, int noOfSides) {
    super(name, noOfSides);
    }
    
    @Override
    public abstract double getArea();
      
    @Override
    public abstract double getPerimeter();

} 
