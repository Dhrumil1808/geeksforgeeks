import java.util.Scanner;

/**
 * Created by dhrumil on 6/11/17.
 */
public class reverse_linkedlist {
    Node head;
    public  class Node
    {
        Node next;
        int data;
        Node(int d) {data = d; next = null; }
    }

    public void append(int new_data)
    {

    Node new_node=new Node(new_data);
        if(head==null)
        {
            head=new Node(new_data);
            return;
        }
    new_node.next=null;
        Node last=head;

        while(last.next!=null)
        {
            last=last.next;
        }

        last.next=new_node;

        return;

    }
    /* reverse linkedlist iteratively */
    public Node reverse(Node node)
    {
        Node prev=null;
        Node current=node;
        Node next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node = prev;
        return node;

    }

    /* reverse linkedlist recursively */
    public void reverse_recursion(Node node)
    {
        if(node==null)
            return;

       reverse_recursion(node.next);
        System.out.println(node.data);

    }
   /* public Node reverse_recursion(Node node)
    {
        if(node==null)
            return null;
        else if(node.next==null)
            return node;
        else
        return reverse_recursion(node.next);
    }*/

    public void printlist(Node temp)
    {

        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }

    /* reverse linked list iteratively */
    public static void main(String[] args)
    {
        reverse_linkedlist reverse=new reverse_linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            reverse.append(data);
        }
        reverse.reverse_recursion(reverse.head);
       // reverse.printlist();

    }
}
