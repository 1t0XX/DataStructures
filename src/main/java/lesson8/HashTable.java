package lesson8;



public interface HashTable<K, V> extends ICollection<T> {

    boolean put(K key, V value);

    V get(K key);

    boolean contains(K key);

    V remove(K key);

    void display();


    interface Entry<K, V> {
        K getKey();
        void setKey(K key);

        V getValue();
        void setValue(V value);
    }


}