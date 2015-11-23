package node;

public class SimpleLinkedList {

    private Node root;
    private int size;

    public SimpleLinkedList() {
        size = 0;
    }

    public void addFirst(Object obj) {

        Node node = new Node();
        node.obj = obj;

        if (root != null){
            node.ref = root;
        }
        root = node;
        size ++;
    }

    public void addLast(Object obj) {

        Node n = new Node();
        n.obj = obj;

        if (root == null){
            root = n;
        }else{
            Node last  = root;
            Node cp = root;
            while (cp.ref != null){
                last = cp;
                cp = cp.ref;
            }
            last.ref = n;
        }
        size ++;

    }

    public void printList(){
        if (size == 0){
            System.out.println("list is empty");
        }

        System.out.print("{");
        Node cp = root;
        while(cp.ref != null){
            System.out.print(cp.obj + ", ");
            cp = cp.ref;
        }
        System.out.print(cp.obj);
        System.out.println(" }");
    }

    public void addAfter(Object obj, Object prev) {

        Node prevP = null;
        Node cp = root;

        do{
            if (cp.obj == prev){
                prevP = cp;
                break;
            }
            cp = cp.ref;
        }while (cp != null && cp.ref != null );

        if (prevP == null){
            throw new IllegalStateException("List does not contain prev object.");
        }

        Node n = new Node();
        n.obj = obj;

        if (prevP.ref != null){
            n.ref = prevP.ref;
        }
        prevP.ref = n;
        size ++;

    }

    public int getSize() {
        return size;
    }

    private class Node {

        private Object obj;
        private Node ref;

//        public Node() {
//        }
//
//        public Object getObj() {
//            return obj;
//        }
//
//        public void setObj(Object obj) {
//            this.obj = obj;
//        }
//
//        public Node getRef() {
//            return ref;
//        }
//
//        public void setRef(Node ref) {
//            this.ref = ref;
//        }
    }

}


