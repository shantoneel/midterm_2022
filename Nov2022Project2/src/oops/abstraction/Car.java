package oops.abstraction;

public interface Car extends Motor,Wheel{
    //interface is abstract class. Can only declare abstract method. method without a body.
    int number = 45; //final variable
    void start();
     void brake();
     String carShape();
}
