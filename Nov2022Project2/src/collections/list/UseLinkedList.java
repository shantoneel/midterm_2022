package collections.list;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(4);
        list1.add(8);
        System.out.println(list1);
        list1.add(3,9);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        list1.set(2,8);
        System.out.println(list1);
    }
}
