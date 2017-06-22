package doubly_linkedlist;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/21/17.
 */
public class linked_list {

    Node head;
    public class Node
    {
    int data;
    Node next;
    Node prev;
    Node(int d) {
        data=d;
        next=null;
        prev=null;
    }

    }
            /* adds Node at the front of the list */
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        new_node.prev=null;
        head=new_node;
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

    public void insert_after(Node prev_node,int data)
    {

        if(prev_node==null)
        {
            System.out.println("The given previous node cannot be null");
        }
        else
        {
            Node new_node=new Node(data);

            new_node.next=prev_node.next;
            prev_node.next=new_node;
            new_node.prev=prev_node;



        }
    }


    public void insert_before(Node next_node,int data)
    {

        if(next_node==null)
        {
            System.out.println("The given next node cannot be null");
        }
        else
        {
            Node new_node=new Node(data);
            new_node.prev= next_node.prev;
            new_node.next=next_node;
            next_node.prev=new_node;
            if(new_node.prev!=null)
            {
                new_node.prev.next=new_node;
            }
            else
            {

            }

        }
    }


    public void delete(Node head, Node del)
    {
          /* base case */
        if (head == null || del == null) {
            return;
        }

        /* If node to be deleted is head node */
        if (head == del) {
            head = del.next;
        }

        /* Change next only if node to be deleted is NOT the last node */
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        /* Change prev only if node to be deleted is NOT the first node */
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        /* Finally, free the memory occupied by del*/
        return;
    }


    public void print()
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
        //Scanner sc=new Scanner(System.in);

        linked_list list=new linked_list();
        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.insert_after(list.head, 8);
        list.delete(list.head,list.head.next.next);
        list.print();
    }





}
