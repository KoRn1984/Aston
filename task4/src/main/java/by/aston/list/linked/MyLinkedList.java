package by.aston.list.linked;

public class MyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Конструктор, принимающий другую коллекцию.
     */
    public MyLinkedList(MyLinkedList<? extends T> other) {
        for (Node<? extends T> current = other.head; current != null; current = current.next) {
            add(current.data);
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
        size--;
    }

    public void addAll(MyLinkedList<T> other) {
        Node<T> current = other.head;
        while (current != null) {
            add(current.data);
            current = current.next;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }
    }

    public int size() {
        return size;
    }

    /**
     * Статический метод сортировки пузырьком.
     * (super не применимо в данном случае, так как мы не добавляем элементы, а инициализируем коллекцию)
     */
    public static <T extends Comparable<T>> void bubbleSort(MyLinkedList<T> list) {
        if (list.head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node<T> current = list.head;
            while (current.next != null) {
                if (current.data.compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}