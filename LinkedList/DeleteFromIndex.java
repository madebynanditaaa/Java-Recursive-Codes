package SEM5.LinkedList;

public class DeleteFromIndex
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
    //addLast
    public void addLast(int data)
    {
        Node newNode=new Node(data);
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
    public static void main(String args [])
    {
        DeleteFromIndex obj=new DeleteFromIndex();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        System.out.println("Original List");
        obj.printList();
        System.out.println("Deleted....Updated List");
        obj.deleteFromIndex(4);
        obj.printList();
    }
}
