package lesson3.queue;

import lesson2.ICollections;

public interface Queue<E> extends ICollections<E> {


    boolean insert(E value);

    E remove();

    E peek();


}
