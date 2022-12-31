package oops.polymorphism;

public class TestCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(3,4,5);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add(3,2);
    }
}
