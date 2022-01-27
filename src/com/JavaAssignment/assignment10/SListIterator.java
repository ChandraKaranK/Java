package com.JavaAssignment.assignment10;

public class SListIterator<T> {

    private Node<T> previous = null;
    Node<T> head = null;
    private Node<T> current;
    private Node<T> currentIter;

    void add(T object)
    {
        current = new Node<T>(object);
        if(this.head==null)
        {
            this.head = current;
            this.previous = current;
            this.currentIter = head;
        }
        else
            {
            this.previous.next = current;
            this.previous = current;
            }

    }

    boolean hasNext()
    {
        if(this.currentIter==null)
            return false;
        else
                return true;
    }

    String next()
    {
       Node<T> temp = this.currentIter;
       this.currentIter = temp.next;
        return temp.data.toString();
    }

    void remove()
    {
        if(head!=null)
            head = head.next;
    }


    void printList()
    {
        Node<T> t = this.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }

}
