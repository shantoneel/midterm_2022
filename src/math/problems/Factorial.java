package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


                int num = 5;
                long factorial = findFactorial(num);
                System.out.println("Factorial of " + num + " is " + factorial);
            }
            public static long findFactorial(int num)
            {
                if (num >= 1)
                    return num * findFactorial(num - 1);
                else
                    return 1;
            }
        }

