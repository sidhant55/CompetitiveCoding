package Rough;

import java.util.*;

abstract class shape
{
    shape()
    {
        System.out.println("abstract");
    }
    abstract double area();
}

public class abstraction {
    public static void main(String args[]) {

        circle obj1=new circle(5);

        square obj2=new square(5);

        System.out.println(obj1.area()+" "+obj2.area());

    }
}

class circle extends shape
{
    double radi;
    circle(double radi)
    {
        this.radi=radi;
        System.out.println("circle");
    }
    @Override
    double area()
    {
        return (3.14*radi*radi);
    }
}

class square extends shape
{
    double side;
    square(double side)
    {
        this.side=side;
        System.out.println("square");
    }
    @Override
    double area()
    {
        return (side*side);
    }
}
