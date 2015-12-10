package node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringJoiner;

public class Demo {

    public static void main(String[] args){

        SimpleLinkedList list = new SimpleLinkedList();

        list.addFirst("test 1");
        list.addFirst("test 2");
        list.addFirst("test 3");
        list.addLast("z");
        list.addAfter("aa","test 1");
        list.addAfter("z1","z");
        list.addAfter("z2","test 2");

        for (Object s : list){
            System.out.println(s);
        }


        for (Iterator<Object> it = list.iterator(); it.hasNext();){
            Object o = it.next();
            System.out.println(o);
        }

        System.out.println();
        System.out.println("Delete from our list");
        for (Iterator<Object> it = list.iterator(); it.hasNext();){
            it.next();
            it.remove();
            break;
        }


    }

}
