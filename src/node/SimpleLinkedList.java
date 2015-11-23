package node;

import java.util.LinkedList;

public class SimpleLinkedList {

    private Node root;
    private int size;
    private LinkedList<Object> lList;

    public SimpleLinkedList() {
        size = 0;
        lList = new LinkedList<>();
    }

    private void addFirst(Object obj) {

        Node node = new Node();
        node.setNode(root);
        node.setObj(node);
        lList.add(0,node);


    }

    private void addLast(Object obj) {

    }

    private void addAfter(Object obj, Object prev) {

    }

    private int getSize() {
        return size;
    }

    private class Node {

        private Object obj;
        private Node node;

        public Node() {
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
    }

}


