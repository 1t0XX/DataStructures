package lesson3.stack;

import lesson2.ICollections;

public interface Stack<E> extends ICollections<E> {

    void push(E value);

    E pop();

    E peek();
}
