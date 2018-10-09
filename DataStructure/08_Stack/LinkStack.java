package Stack;
//链栈的实现
public class LinkStack {
    private Node head;
    private int count;
    public static void main(String[]args)
    {
        LinkStack ls = new LinkStack();
        ls.inStack(0);
        ls.inStack(1);
        ls.inStack(2);
        ls.inStack(3);
        ls.inStack(4);
        ls.outStack();
        ls.outStack();
        ls.outStack();
        ls.outStack();
        ls.outStack();
        ls.outStack();



    }

    public LinkStack()
    {
        this.head = new Node(-1);
        this.count=0;
    }
    private void inStack(int n)
    {
        if(count==0)
        {
            head.setData(n);
            head.setNext(null);
            count++;
            System.out.println(String.valueOf(n)+"入栈成功");
        }
        else
        {
            Node node = new Node(n);
            node.setNext(head);
            count++;
            head = node;
            System.out.println(String.valueOf(n)+"入栈成功");
        }
    }
    private void outStack()
    {
        if(count==0)
        {
            System.out.println("出栈失败");
            return;
        }
        else
        {
            int n = head.getData();
            head = head.getNext();
            count--;
            System.out.println(String.valueOf(n)+"出栈成功");
        }
    }
}

class Node
{
    private int data;
    private Node next;
    public Node(int data)
    {
        this.data = data;
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
