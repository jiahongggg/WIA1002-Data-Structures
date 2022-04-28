package lab6;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(getSize() - 1);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return "stack: " + list.toString();
    }

    public boolean search(E o) {
        return list.contains(o);
    }

}
