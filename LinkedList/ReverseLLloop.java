package SEM5.LinkedList;

public class ReverseLLloop
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void printList()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    
    public void reverse()
    {
        Node currNode=head;
        Node previous=null;
        Node nextNode=null;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null)
        {
            nextNode=currNode.next;
            currNode.next=previous;
            previous=currNode;
            currNode=nextNode;
        }
        head=previous;
    }
    
    public static void main(String args [])
    {
        ReverseLLloop obj=new ReverseLLloop();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(4);
        obj.addFirst(5);
        System.out.println("Original List");
        obj.printList();
        System.out.println("Reversed List");
        obj.reverse();
        obj.printList();
    }
}
