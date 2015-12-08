package stackClass;

public class Demo {

    public static void main(String[] args) {

        Stack stack =  new Stack();
        System.out.println( stack.toString());
        for (int i = 0; i < 4; i++) {
            stack.add(new Integer(i));
        }
        System.out.println(stack.toString());
        stack.peek(21);
        stack.push(56);
        System.out.println(stack.toString());
        System.out.println("Value from index 3: "+stack.peek(3));
        System.out.println("Remove value from index 3");
        stack.pop(3);
        System.out.println(stack.toString());

    }
}

