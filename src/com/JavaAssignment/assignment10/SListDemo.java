package com.JavaAssignment.assignment10;

public class SListDemo {

    public static void main(String args[])
    {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> numbers = list.iterator();

        numbers.add(12);
        numbers.add(35);
        numbers.add(45);
        numbers.add(60);

       numbers.printList();

       System.out.println("----");

       while(numbers.hasNext())
           System.out.println(numbers.next());

       System.out.println("----");
       numbers.remove();
       numbers.add(100);

       numbers.printList();

    }

}
