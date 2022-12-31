package nestedclass;

public class Practice {

    InnerPractice i = new InnerPractice();

    Practice(){

    }
    public class InnerPractice {
        InnerPractice() {

        }

        public void showInnerPractice() {
            System.out.println("Inner");
        }
    }
    }

