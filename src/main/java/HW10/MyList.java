package HW10;

public interface MyList<E> {
        int size();
        boolean isEmpty();
        boolean contains(E element);
        boolean add(E element);
        boolean remove(E element);
        E get(int index);
        E set(int index, E element);
        String toString();
}
