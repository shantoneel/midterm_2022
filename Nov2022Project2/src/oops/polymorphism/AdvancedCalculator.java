package oops.polymorphism;

public class AdvancedCalculator extends Calculator{
    //method overriding
    public void add(int a, int b) {
        int total = (a+b)*10;
        System.out.println(total);
    }
}
