package circular_linked_list;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/22/17.
 */
public class circular_linkedlist {

    Node head;
    public class Node
    {
        Node next;
        int data;
        Node(int d) { data=d; next=null;}
    }
    /* inserts node at the front of the linked list*/
        public void push(int new_data)
        {
            Node new_node=new Node(new_data);
            if(head==null) {
                head = new_node;
                head.next= head;
                return;
            }
            else
            {

                Node last=head.next;

                while(last.next!=head)
                {
                    last=last.next;
                }

                last.next=new_node;
                new_node.next = head;
                head=new_node;
                return;

            }

        }

        public int size()
        {
            Node temp=head;
             int i=0;
            if(temp==head) {
                i++;
             //   System.out.println(temp.data);
                temp = temp.next;
            }
            while(temp!=head)
            {
                i++;
               // System.out.println(temp.data);
                temp=temp.next;
            }
            return i;
        }
        public void delete(int key)
        {

            Node prev=null;
            Node current=head;

            int i=0;
            while(current.data!=key)
            {
                i++;
                if(i==size())
                {
                    System.out.println("the node with required key is not found");
                    return;
                }
                prev=current;
                current=current.next;
            }

            if(current.next==head && size()!=1)
            {

                prev.next=head;
                return;
            }

            else if(current.next==head && size()==1)
            {

                head=null;
                return;
            }
            else if(current==head)
            {
                Node last=head.next;

                while(last.next!=head)
                {
                    last=last.next;
                }
                last.next=current.next;
                head=current.next;
                return;

            }
            else
            {
                prev.next=current.next;
                return;
            }

        }

/* inserts node at the end of the linked list*/
    public void append(int new_data)
    {
        Node new_node=new Node(new_data);
        if(head==null) {
            head = new_node;
            head.next=head;
            return;
        }

           Node last=head.next;

           while(last.next!=head)
           {
               last=last.next;
           }
           last.next=new_node;
           new_node.next=head;


    }

        public void print()
        {
            Node temp=head;
            if(temp==head) {
               System.out.println(temp.data);
                temp = temp.next;
            }
            while(temp!=head)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
           // System.out.println(temp.data);

        }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        circular_linkedlist circular=new circular_linkedlist();
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
           circular.append(data);
        }
        circular.delete(8);
      //  int length=circular.size();
        //System.out.println(length);
      circular.print();
    }

}
