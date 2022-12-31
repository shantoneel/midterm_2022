package oops.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        //single inheritance

        ClassB David = new ClassB();
        David.education();
        ClassA Jack = new ClassA();
        Jack.education();


        //multi leve inheritance
        Father david = new Father(7);
        david.education();

        Son jack = new Son();
        jack.education();
        jack.ricH();

        //hierarchical
        david.canCommunicate();
        Bird b = new Bird();
                b.birdCommunicate();
    }
}
