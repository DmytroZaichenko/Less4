package stackClass;

import java.util.*;

public class Stack {

    private List<Object> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(Object obj) {

        if (list.size() == 0) {
            list.add(obj);
        } else {
            list.add(0, obj);
        }

    }

    public void pop() {
        try {
            list.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List is empty");
        }

    }

    public Object peek() {

        Object result = null;
        try {
            result = list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List is empty");
        }

        return result;
    }

    @Override
    public String toString() {
        return list.size() == 0 ? "List is empty" : Arrays.toString(list.toArray());
    }
}
