package array;

import lesson2.ICollections;

public interface Array<E>  extends ICollections<E> {

        void add(E value);

       default void AllAdd(E... values){
            for (E value: values) {
                add(value);
            }
        }

        boolean remove(E value);

        boolean remove(int index);

        E get(int index);

        boolean contains(E value);

        int indexOf(E value);



        void display();

        void sortBubble();
        void sortSelect();
        void sortInsert();

}
