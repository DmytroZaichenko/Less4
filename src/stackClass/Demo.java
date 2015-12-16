package stackClass;

public class Demo {

    public static void main(String[] args) {

        Stack stack =  new Stack();
        System.out.println( stack.toString());
        for (int i = 0; i < 4; i++) {
            stack.push(new Integer(i));
        }
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.push(23);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());


    }
}

