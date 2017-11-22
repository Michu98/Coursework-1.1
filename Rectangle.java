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
public class Rectangle extends TwoDShapes {   
        
        private final double _height;
        private final double _width;

            public Rectangle(String name, double height, double width) {
            super(name,4);
            _height = height;
            _width = width;
            }
                @Override
                    public double getArea() {
                    return _height * _width;
                }
                @Override
                    public double getPerimeter() {
                    return (_height + _width) * 2;
    }
}


