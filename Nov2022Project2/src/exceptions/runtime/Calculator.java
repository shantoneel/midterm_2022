package exceptions.runtime;

public class Calculator {
    public static void main(String[] args) {
      try {
          System.out.println(1/0);
      } catch(ArithmeticException e){
          System.out.println("Error");
          e.printStackTrace();

      }
    }
}
