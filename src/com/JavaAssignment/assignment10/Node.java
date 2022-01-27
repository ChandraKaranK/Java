package com.JavaAssignment.assignment10;

public class Node<T> {

    Node<T> next;
    T data;

    Node(T data)
    {
     this.data = data;
     this.next = null;
    }

}
