package by.aston.list;

import by.aston.list.array.MyArrayList;
import by.aston.list.linked.MyLinkedList;

public class MyList {
    public static void main(String[] args) {

        // Пример использования MyArrayList.
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(8);
        myArrayList.add(1);
        myArrayList.add(3);

        System.out.println("MyArrayList до сортировки: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        MyArrayList.bubbleSort(myArrayList);

        System.out.println("\nMyArrayList после сортировки: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        myArrayList.remove(2);
        System.out.println("\n\nПосле удаления элемента из MyArrayList с index = 2: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        // Пример использования MyLinkedList.
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Banana");
        myLinkedList.add("Apple");
        myLinkedList.add("Orange");
        myLinkedList.add("Grape");

        System.out.println("\n\nMyLinkedList до сортировки: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }

        MyLinkedList.bubbleSort(myLinkedList);

        System.out.println("\nMyLinkedList после сортировки: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }

        myLinkedList.remove(2);
        System.out.println("\n\nПосле удаления элемента из MyLinkedList с index = 2: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }

        // Пример использования конструктора с другой коллекцией для MyArrayList.
        MyArrayList<Integer> anotherArrayList = new MyArrayList<>(myArrayList);
        System.out.println("\n\nДругой anotherArrayList, инициализированный из первого: ");
        for (int i = 0; i < anotherArrayList.size(); i++) {
            System.out.print(anotherArrayList.get(i) + " ");
        }

        // Пример использования конструктора с другой коллекцией для MyLinkedList.
        MyLinkedList<String> anotherLinkedList = new MyLinkedList<>(myLinkedList);
        System.out.println("\n\nДругой anotherLinkedList, инициализированный из первого: ");
        for (int i = 0; i < anotherLinkedList.size(); i++) {
            System.out.print(anotherLinkedList.get(i) + " ");
        }
    }
}