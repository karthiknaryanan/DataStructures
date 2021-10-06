package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String args[]) {
        Set s = new TreeSet();
        s.add("4");
        s.add(8);
        Iterator itr = s.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }
}