package node;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

public class Demo {

    public static void main(String[] args){

        SimpleLinkedList sll = new SimpleLinkedList();

        sll.addFirst("a");
        sll.addFirst("b");
        sll.addFirst("c");
        sll.addFirst("z");
        sll.addAfter("1z","z");
        sll.addAfter("z1","1z");

        for (Object a:sll ) {
            System.out.println(a);
        }

//        sll.addFirst("test 1");
//        sll.addFirst("test 2");
//        sll.addFirst("test 3");
//
//        System.out.print(sll.getSize()+" ");
//        sll.printList();
//
//        String mark = new String("mark");
//
//        sll.addLast(mark);
//        sll.addLast("test 0");
//        System.out.print(sll.getSize() + " ");
//        sll.printList();
//
//        String middle = new String("middle");
//        sll.addAfter(mark, middle );
//        System.out.print(sll.getSize() + " ");
//        sll.printList();
//
//        sll.addAfter("middle (-1)", mark);
//        System.out.print(sll.getSize() + " ");
//        sll.printList();

//        System.out.println();
//        System.out.println("test addAfter, lost size == 1");
//        System.out.println();
//
//        sll = new SimpleLinkedList();
//        sll.addLast(mark);
//        System.out.println(sll.getSize() + "");
//        sll.printList();
//
//        sll.addAfter("last", mark);
//        System.out.print(sll.getSize() + " ");
//        sll.printList();
//
//        System.out.println();
//        System.out.println("test addAfter, no prev element exception");
//        System.out.println();
//
//        sll = new SimpleLinkedList();
//        sll.addLast("test");
//        System.out.print(sll.getSize() + " ");
//        sll.printList();
//        System.out.println();
//
//        sll.addAfter("last", mark);
//        System.out.print(sll.getSize() + " ");
//        sll.printList();
//
//        System.err.println("test iterator");
//        System.out.println();
//
//
//        for (Iterator<Object> it = sll.iterator(); it.hasNext();){
//            Object o = it.next();
//            System.out.println(o);
//        }

//        for (Iterator<Object> it = sll.iterator(); it.hasNext();){
//            it.next();
//            it.remove();
//            break;
//        }
//
//        sll.printList();



    }

}
