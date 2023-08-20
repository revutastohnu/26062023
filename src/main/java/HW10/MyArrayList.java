package HW10;
import java.util.Objects;
import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] data;
    private int size;
    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int requiredCapacity) {
        if (requiredCapacity > data.length) {
            int newCapacity = Math.max(data.length * 2, requiredCapacity);
            data = Arrays.copyOf(data, newCapacity);
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        int i = 0;
        while (i < size) {
            if (Objects.equals(element, data[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity(size + 1);
        data[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(E element) {
        int i = 0;
        while (i < size) {
            if (Objects.equals(element, data[i])) {
                int MovedElements = size - i - 1;
                if (MovedElements > 0) {
                    System.arraycopy(data, i + 1, data, i, MovedElements);
                }
                data[size-1] = null;
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Provided index: " + index + ", List's size: " + size);
        }
        return (E) data[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Provided index: " + index + ", List's size: " + size);
        }
        E previousValue = (E) data[index];
        data[index] = element;
        return previousValue;
    }
    @Override
    public String toString() {
        if (size == 0) return "The list is empty";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

}
