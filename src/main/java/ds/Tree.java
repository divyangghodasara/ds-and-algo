package ds;

public interface Tree<K> {
    void insert(K k);
    boolean search(K k);
    void delete(K k);
}
