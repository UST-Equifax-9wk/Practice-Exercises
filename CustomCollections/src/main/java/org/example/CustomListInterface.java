package org.example;

public interface CustomListInterface<T> {
    //Array list - backed by an array, with a grow operation
    //Linked List - backed by a linkedlist which is a series of linked nodes (you can also appempt circularly linked
    //     list, and/or doubly-linked list
    //or something else entirely... queue, stack, deque

    /*
    void add(Object obj) - add to end of list
    void add(int index, Object obj) - replace item at index
    void remove(int index)
    Object get(int index)
    int length()
    int find(Object obj)//could also be generic find(T t)
    void clear()
     */

    void add(T t);
    void add(int index, T t);
    void remove(int index);
    T get(int index);
    int length();
    int find(T t);
    void clear();

}
