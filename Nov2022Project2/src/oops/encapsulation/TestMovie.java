package oops.encapsulation;

public class TestMovie extends Movie{
    public static void main(String[] args) {
        Movie got = new Movie();
        got.setRate("PG");
       String rate= got.getRate();
        System.out.println(rate);


        
    }
}
