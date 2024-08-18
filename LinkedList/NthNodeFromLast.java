package SEM5.LinkedList;

import java.util.Scanner;
public class NthNodeFromLast
{
    private int size;
    NthNodeFromLast()
    {
        size=0;
    }
    Node head;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //addLast
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
    }
    //delete from a position
    public void deleteFromIndex(int index)
    {
        if(head==null)
        {
            return;
        }
        size--;
        Node currNode=head;
        Node nextNode=head.next;
        int count=0;
        for(int i=1; i<index-1; i++)
        {
            currNode=currNode.next;
            nextNode=nextNode.next;
        }
        currNode.next=nextNode.next;
    }
    public void printList()
    {
        if(head==null)
        {
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public int getsize()
    {
        return size;
    }
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        NthNodeFromLast obj=new NthNodeFromLast();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        System.out.println("Original List");
        obj.printList();
        
        int size=obj.getsize();
        //if starting from 1st.....n=2; starting from behind nth location=size-2+1
        System.out.println("Enter nth term to be deleted from behind.");
        int n=sc.nextInt();
        int nth=size-n+1;
        System.out.println("Deleted....Updated List");
        obj.deleteFromIndex(nth);
        obj.printList();
    }
}
