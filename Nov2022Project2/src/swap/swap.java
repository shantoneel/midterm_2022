package swap;

public class swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int temp;
        System.out.println("a: "+a);
        System.out.println("a: "+b);

        temp = a;
        a=b;
        b = temp;
        System.out.println("a: "+a);
        System.out.println("a: "+b);
    }
}
