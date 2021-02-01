package org.example.utils;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = new Node("head");
        tail = head;
    }

    public void add(Node node) {
        tail.setNext(node);
        tail = node;
    }

    public Node head(){
        return head;
    }

    public Node tail(){
        return tail;
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(final String data) {
            this.data = data;
        }

        public void setNext(final Node node) {
            next = node;
        }

        public void setData(final String data) {
            this.data = data;
        }

        public Node next(){
            return next;
        }

        public String data(){
            return data;
        }


    }
}
