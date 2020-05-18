package lesson2;



public interface ICollections<E> {

    int size();

    boolean isEmpty();

    default boolean isFull(){
        return false;
    }
}
