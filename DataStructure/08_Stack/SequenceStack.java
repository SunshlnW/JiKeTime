package Stack;
//顺序栈的实现
public class SequenceStack {
    private String stack[];
    private int count;
    private int n;
    public static void main(String[]args)
    {
        SequenceStack ss = new SequenceStack(5);
        ss.inStack("a");
        ss.inStack("b");
        ss.inStack("c");
        ss.inStack("d");
        ss.inStack("e");
        ss.inStack("f");
        System.out.println(ss.outStack()+"出栈");
        System.out.println(ss.outStack()+"出栈");
        System.out.println(ss.outStack()+"出栈");
        System.out.println(ss.outStack()+"出栈");
        System.out.println(ss.outStack()+"出栈");
        System.out.println(ss.outStack()+"出栈");

    }
    public SequenceStack(int n)
    {
        this.n = n;
        this.stack = new String[n];
        this.count = 0;
    }
    public void inStack(String s)
    {
        if(count == n)
        {
            System.out.println(s+"入栈失败");
            return;
        }
        else
        {
            stack[count] = s;
            count++;
            System.out.println(s+"入栈成功");
            return;
        }
    }

    public String outStack()
    {
        if(count==0)
        {
            return null;
        }
        else
        {
            String s = stack[count-1];
            count--;
            return s;
        }
    }
}
