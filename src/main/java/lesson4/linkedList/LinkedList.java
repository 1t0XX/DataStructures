package lesson4.linkedList;


import lesson2.ICollections;
import lesson6.Node;

public interface LinkedList<E> extends ICollections, Iterable<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    void display();

    E getFirstValue();

    int size();

    boolean isEmpty();

    default boolean isFull(){
        return false;
    }






    class Entry<T> {
        public final T value;
        public Entry<T> next;

        public Entry(T value) {
            this.value = value;
        }
    }

    }


