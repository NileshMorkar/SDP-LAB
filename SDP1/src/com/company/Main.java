package com.company;
//package SDP1

public class Main {

    public static void main(String[] args) {
        Square s = new Square(5);
        Rectangle r = new Rectangle(5,5);
	    System.out.println("Area of Square ==> "+ s.getArea());
	    System.out.println("Area of Rectangle ==> "+ r.getArea());
        Shape shape ;
//        shape = new Rectangle();
//        shape.getArea(4,6);

    }
}

abstract class Shape{
    abstract protected double getArea();
    //For Access Specifier
    //1. private ==> abstract method cannot be private
    //2.protected,public ==> ok

}

class Rectangle extends Shape{
    int l;
    int b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public double getArea() {
        return 2*l*b;
    }
}
class Square extends Shape{
        int side;

        Square(int side){
            this.side = side;
        }

        @Override
        public double getArea() {
            return side*side;
        }
        //We cannot assign weaker access specifier
}