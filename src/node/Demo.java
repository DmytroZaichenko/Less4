package node;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args){

        SimpleLinkedList sll = new SimpleLinkedList();
        sll.addFirst("1. First");
        sll.addFirst("2. Second");
        sll.addFirst("3. the third");

        for (Iterator<Object> it = sll.iterator(); it.hasNext();){
            Object o = it.next();
            System.out.println(o);
        }

        for (Iterator<Object> it = sll.iterator(); it.hasNext();){
            it.next();
            it.remove();
            break;
        }

        sll.printList();



    }

}
