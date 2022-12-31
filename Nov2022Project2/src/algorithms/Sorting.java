package algorithms;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {8,3,2,6,1,0,5,4,7,9};
        int temp;
        for (int i = 1;i< array.length;i++){
            for (int j=i;j>0;j--) {
                if (array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array [j-1] = temp;
                }
            }

        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);


    }
}
