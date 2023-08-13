package HW11;

import java.util.Collection;

public interface myList<E> {
    int size();
    boolean isEmpty();
    boolean contains(E element);
    boolean add(E element);
    E remove(int index);
    boolean addAll(Collection<? extends E> collection);
    E get(int index);
    E set(int index, E element);
    String toString();
}
