package HW11;

import java.util.Collection;
import java.util.Objects;

import static java.util.Collections.addAll;

public class MyLinkedList<E> implements myList<E> {

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E element) {
            data = element;
            next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        size = 0;
        head = null;
        tail = null;

    }

    public MyLinkedList(Collection<? extends E> collection) {
        this();
        addAll(collection);
        size = collection.size(); // шоб розмір змінювався
        if (!isEmpty()) { // шоб початок та кінець не залишилися null
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            tail = current;
        }
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        Node<E> current = head;
        while (current != null) {
            if (Objects.equals(element, current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        }
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        for (E element : collection) {
            add(element);
        }
        return true;
    }
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Provided index: " + index + ", List's size: " + size);
        }
        if (index == 0) {
            E removedElement = head.data;
            head = head.next;
            size--;
            return removedElement;
        }
        Node<E> current = head;
        int i = 0;
        while (i < index - 1) {
            current = current.next;
            i++;
        }
        Node<E> removedNode = current.next;
        current.next = removedNode.next;
        size--;
        return removedNode.data;
    }


    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Provided index: " + index + ", List's size: " + size);
        }
        Node<E> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Provided index: " + index + ", List's size: " + size);
        }
        Node<E> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        E oldValue = current.data;
        current.data = element;
        return oldValue;
    }

    @Override
    public String toString() {
        if (size == 0) return "The list is empty";
        StringBuilder result = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        return result.toString();
    }
}
