package oops.abstraction;

public class Toyota extends ModernCar implements Car,Wheel{

    //belongs to Toyota
    public void carColor(){
        System.out.println("grey");
    }

//belong to car interface
    public void start() {
        System.out.println("turn the key");

    }

    public void brake() {
        System.out.println("break to stop");
    }

    public String carShape() {
        String shape = "rectangle";
        return shape;
    }

    //belongs to wheel interface
    public void numberOfWheels() {
        System.out.println("four wheel car");
    }


    //motor interface
    public void engine() {
        System.out.println("v6");
    }


    public void fuelType() {
        System.out.println("diesel");

    }

    public void autoLock() {
        System.out.println("ten seconds autolock");
    }
}
