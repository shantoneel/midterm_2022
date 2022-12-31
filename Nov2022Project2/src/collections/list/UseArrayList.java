package collections.list;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add("jack");
        list.add(true);
        list.add(2.34);
        list.add(0,.81);
        System.out.println(list);

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(8);
        list1.remove(1);
        System.out.println(list1);
        list1.add(1,9);

        System.out.println(list1);


    }
}
