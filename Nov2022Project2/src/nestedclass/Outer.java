package nestedclass;

public class Outer {
    Inner inner = new Inner();
    int outerNum = 5;
    Outer(){

    }
    public void outerMethod(){
        System.out.println("This is an outer class method");
    }
    public class Inner{


        int innerNum = 10;
        Inner(){

        }
        public void innerMethod(){
            System.out.println("This is an inner class method");
        }

    }
}
