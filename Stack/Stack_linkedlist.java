package Stack;

/**
 * Created by dhrumil on 6/23/17.
 */
public class Stack_linkedlist {

    Node head;
    public class Node
    {
        int data;
        Node next;
        Node(int d) { data=d; next=null;}
    }

    public boolean isEmpty()
    {
        if(head==null)
            return true;
        else
            return false;
    }
    public void push(int x)
    {
        Node new_node=new Node(x);

            new_node.next=head;
            head=new_node;
        System.out.println(x + " pushed to stack");
    }

    public int pop()
    {
        //Node temp=head;
        Node temp=head;
        int result=temp.data;
        head=head.next;
            return result;
    }

    public int peek()
    {
        if(isEmpty())
            return -1;
        return head.data;
    }

    public static void main(String[] args) {
        Stack_linkedlist stack = new Stack_linkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("popped from stack "+ stack.pop());
        System.out.println("top element is "+ stack.peek());
    }

}
