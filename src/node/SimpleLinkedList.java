package node;

import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object>{

    private Node root;
    private int size;

    public SimpleLinkedList() {
        size = 0;
    }

    public void addFirst(Object obj) {

        Node node = new Node();
        node.setObj(obj);

        if (root != null){
            node.setRef(root);
        }
        root = node;
        size ++;
    }

    public void addLast(Object obj) {

        Node n = new Node();
        n.setObj(obj);

        if (root == null){
            root = n;
        }else{
            Node last  = root;
            Node cp = root;
            while (cp.getRef() != null){
                cp = cp.getRef();
                last = cp;
            }
            last.setRef(n);
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
            System.out.print(cp.getObj() + ", ");
            cp = cp.getRef();
        }
        System.out.print(cp.getObj());
        System.out.println(" }");
    }

    public void addAfter(Object obj, Object prev ) {

        Node prevP = null;
        Node cp = root;

        do{
            if (cp.getObj() == prev){
                prevP = cp;
                break;
            }
            cp = cp.getRef();
        }while (cp != null );

        if (prevP == null){
            throw new IllegalStateException("List does not contain prev object.");
        }

        Node n = new Node();
        n.setObj(obj);

        if (prevP.getRef() != null){
            n.setRef(prevP.getRef());
        }
        prevP.setRef(n);
        size ++;

    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return new SLLIterator();
    }

    private class Node {

        private Object obj;
        private Node ref;

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        public Node getRef() {
            return ref;
        }

        public void setRef(Node ref) {
            this.ref = ref;
        }
    }

    private class SLLIterator implements Iterator<Object>{

        private Node curNode;
        private Node prevNode;

        public SLLIterator() {
        }

        @Override
        public boolean hasNext() {
            return (curNode == null && root != null) || (curNode != null && curNode.ref != null);
        }

        @Override
        public Object next() {
            if (curNode == null && root != null){
                curNode = root;
                return curNode.getObj();
            }

            if (hasNext()){
                prevNode = curNode;
                curNode = curNode.ref;
                return curNode.obj;
            }
            throw new IllegalStateException("List has no more elements.");
        }

        @Override
        public void remove() {
            if(!hasNext() && prevNode == null){
                curNode = null;
                root = null;
            }else if(!hasNext() && prevNode != null){
                prevNode = null;
                curNode = null;
            }else if(hasNext() && prevNode == null){
                root = curNode.ref;
                curNode = root;
            }else {
                prevNode.ref = curNode.ref;
                curNode = curNode.ref;
            }
            size --;
        }
    }

}


