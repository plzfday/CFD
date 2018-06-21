package dev;

public interface StackI {
    boolean is_empty();

    long size();

    Object top();

    void push(Object data);

    Object pop();
}
