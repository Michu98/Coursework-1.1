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
public class Triangle extends TwoDShapes {
        
        private final double _side1;
        private final double _side2;
        private final double _side3;

         public Triangle(String name, double side1, double side2, double side3) {
            super(name, 3); 
            _side1 = side1;
            _side2 = side2;
            _side3 = side3;
    }
                @Override
                public double getArea() {
                 double s = (_side1 + _side2 + _side3) /2;
                 double Area = Math.sqrt(s * (s - _side1) * (s - _side2) * (s - _side3));
               if (Area == 0) {
                System.out.println("This triangle area cannot be computed with the sides given so resulting value will be 0");
                System.out.println();
            }
            return Area;
        }       
                @Override
                public double getPerimeter() {
                return _side1 + _side2 + _side3;
    }                                    
}