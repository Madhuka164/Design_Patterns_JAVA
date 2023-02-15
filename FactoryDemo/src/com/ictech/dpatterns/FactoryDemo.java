package com.ictech.dpatterns;

public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory sf=new ShapeFactory();

        Shape Square=sf.getshape("Square");
        Square.draw();
    }

}
