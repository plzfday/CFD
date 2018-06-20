package dev;

public class Stack implements StackI{
    private static long size = 0;
    private Node top;

    private class Node {
        private Object data;
        private Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    Stack() {
        top = null;
    }

    public boolean is_empty() {
        return (this.top == null);
    }

    public long size() {
        return size;
    }

    public Object top() {
        if(!is_empty()) {
            return this.top.data;
        }
        throw new NullPointerException();
    }

    public void push(Object data) {
        ++size;
        Node newNode = new Node(data);
        newNode.next = this.top;
        this.top = newNode;
    }

    public Object pop() {
        --size;
        Object rtn = this.top();
        top = top.next;
        return rtn;
    }

}