package LinkedList;

public class SinglyLinkedList {
    private static Node head = null;
    public static void main(String[]args)
    {

    }
    public Node findByValue(int value)
    {
        Node p = head;
        while (p.getData()!=value && p !=null)
        {
            p = p.getNext();
        }
        return p;
    }
    public Node findByIndex(int index)
    {
        Node p = head;
        int pos = 0;
        while (pos!=index && p!=null)
        {
            p=p.getNext();
            ++pos;
        }
        return p;
    }
    public void insertToHead(int value)
    {
        //Node p = head;
        Node newNode = new Node(value);
        if(head == null)
            head = newNode;
        else
        {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void insertAfter(Node p,int value)
    {
        if (p==null)
            return;
        Node temp = p.getNext();
        Node newNode = new Node(value);
        p.setNext(newNode);
        newNode.setNext(temp);
    }

    public void insertBefore(Node p,int value)
    {
        if(p==null)
            return;
        if(head==null)
            return;
        if(p==head)
            insertToHead(value);
        else
        {
            Node q = head;
            Node newNode = new Node(value);
            while(q.getNext()!=p)
            {
                q=q.getNext();
            }
            q.setNext(newNode);
            newNode.setNext(p);

        }

    }
    public void deleteByNode(Node p)
    {
        if(head ==null)
            return;
        if(p==head) {
            head = head.getNext();
            return;
        }
        Node q = head;
        while (q.getNext()!=p && q.getNext()!=null)
        {
            q =q.getNext();
        }
        if(q.getNext()==null)
            return;
        q.setNext(p.getNext());


    }

    static class Node{
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data=data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
