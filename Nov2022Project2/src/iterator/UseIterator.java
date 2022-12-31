package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(8);
        Iterator it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
