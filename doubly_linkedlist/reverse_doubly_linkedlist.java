package doubly_linkedlist;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/22/17.
 */
public class reverse_doubly_linkedlist {

    Node head;
    public class Node
    {
        Node next;
        Node prev;
        int data;
        Node(int d) { data=d; next=null;prev=null;}
    }

    public void append(int new_data)
    {
        Node new_node=new Node(new_data);

        if(head==null)
        {
            head=new_node;
            new_node.next=null;
            new_node.prev=null;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            new_node.next=null;
            new_node.prev=temp;
            temp.next=new_node;

        }
    }


    public Node reverse_recursion(Node node)
    {

        if(node==null)
            return node;
        Node new_node=reverse_recursion(node.next);
        System.out.println(node.data);
        //return new_node;
        return null;
    }


   public void reverse()
   {
      Node temp=null;
      Node current=head;
      while(current!=null)
      {
          temp=current.prev;
          current.prev=current.next;
          current.next=temp;
          current=current.prev;
      }
      if(temp!=null)
          head=temp.prev;


   }
    public void print(Node head)
    {
       Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
        reverse_doubly_linkedlist reverse=new reverse_doubly_linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            reverse.append(data);
        }

        Node temp = reverse.reverse_recursion(reverse.head);
        //reverse.print(temp);


    }
}
