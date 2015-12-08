package stackClass;

import java.util.Arrays;
import java.util.LinkedList;

public class Stack {

    private LinkedList<Object> linkedList;
    private int size;

    public Stack() {
        linkedList = new LinkedList<Object>();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Object obj){

        linkedList.addLast(obj);
        if (linkedList.size() > 1){
            linkedList.removeFirst();
            size --;
        }

    }

    public void pop(int index){
        try {
            linkedList.remove(index);
            size --;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index " + index + " out of bounds");
        }

    }

    public Object peek(int index){

        Object result = null;
        try {
            result = linkedList.get(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index " + index + " out of bounds");
        }

        return result;
    }

    public void add(Object obj){
        linkedList.add(obj);
        size ++;
    }

    public void add(int index, Object obj){
        linkedList.add(index, obj);
        size ++;
    }

    @Override
    public String toString() {
        return size == 0? "List is empty" : Arrays.toString(linkedList.toArray());
    }
}
