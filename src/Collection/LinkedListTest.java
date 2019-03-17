package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String>a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String>b = new LinkedList<>();
        b.add("Bob");
        b.add("doug");
        b.add("frances");
        b.add("gloria");

        ListIterator<String>aIter = a.listIterator();
        Iterator<String>bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.remove(b);
        System.out.println(a);

    }

}
