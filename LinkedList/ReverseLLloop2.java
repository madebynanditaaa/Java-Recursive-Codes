package SEM5.LinkedList;

public class ReverseLLloop2
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
        if(head==null || head.next==null)
        {
            System.out.println("List is empty or has only 1 value");
            return;
        }
        Node previous=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=previous;
            //update
            previous=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=previous;
    }
    
    public static void main(String args [])
    {
        ReverseLLloop2 obj=new ReverseLLloop2();
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
