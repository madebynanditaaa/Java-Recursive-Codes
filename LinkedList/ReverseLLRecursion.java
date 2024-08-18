package SEM5.LinkedList;

public class ReverseLLRecursion
{
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
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String args[])
    {
        ReverseLLRecursion obj=new ReverseLLRecursion();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(4);
        obj.addFirst(5);
        obj.addFirst(6);
        System.out.println("Original List:");
        obj.printList();
        obj.head=obj.reverse(obj.head);
        System.out.println("Reversed List:");
        obj.printList();        
    }
}
