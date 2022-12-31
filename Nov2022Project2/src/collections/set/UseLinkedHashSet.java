package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UseLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("King");
        set.add("don");
        set.add("mike");
        set.add("Kelly");
        set.add("Henry");
        set.add("david");
        System.out.println(set);
    }
}
