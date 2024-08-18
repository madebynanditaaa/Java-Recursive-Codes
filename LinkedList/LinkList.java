package SEM5.LinkedList;

class LinkList
{
    Node head;
    private int size;
    LinkList()
    {
        size=0;
    }
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    //add- first, last
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addLast(String data)
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
    }
    //delete first
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
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
    public void printlist()
    {
        if(head==null)
        {
            System.out.println("List is empty");
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
    
    public int getSize()
    {
        return size;
    }
    
    public static void main(String args[])
    { 
        LinkList list=new LinkList();
        //insert
        //print
        //change
        //delete
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();
        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
        System.out.println(list.getSize());
        list.printlist();
        list.addFirst("This");
        System.out.println(list.getSize());        
    }
}
