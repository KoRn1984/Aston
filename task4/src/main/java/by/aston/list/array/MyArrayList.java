package by.aston.list.array;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    /**
     * Конструктор, принимающий другую коллекцию.
     */
    public MyArrayList(MyArrayList<? extends T> other) {
        elements = new Object[other.size];
        size = 0;
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public void addAll(MyArrayList<T> other) {
        for (int i = 0; i < other.size(); i++) {
            add(other.get(i));
        }
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
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
    public static <T extends Comparable<T>> void bubbleSort(MyArrayList<T> list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < list.size; i++) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    T temp = list.get(i - 1);
                    list.elements[i - 1] = list.get(i);
                    list.elements[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}