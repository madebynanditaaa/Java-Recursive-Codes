package SEM5.LinkedList;

import java.util.*;

class LinkListCollection
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();
        
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);
        list.addLast("java");
        System.out.println(list);
        list.add("code");//if i write add instead id addLast: it by default goes to last position
        int size=list.size();
        System.out.println("Size: " + size);
        for(int i=0; i<size; i++)
        {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println("Removing element at index 2");
        list.remove(2);
        System.out.println(list);
    }
}
