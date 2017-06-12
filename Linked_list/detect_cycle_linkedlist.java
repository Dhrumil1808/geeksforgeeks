import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/11/17.
 */
public class detect_cycle_linkedlist {

    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            next=null;
        }
    }


    HashMap<Node,Integer> hash=new HashMap<Node,Integer>();

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        detect_cycle_linkedlist list=new detect_cycle_linkedlist();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            list.append(data);
        }
        list.printlist();
        Node temp=list.head;
        temp.next=temp.next.next;
        boolean cycle=list.detect_cycle();
        System.out.println(cycle);

    }

    public  boolean detect_cycle()
    {
        Node temp=head;

        while(temp!=null)
        {
            //System.out.println(temp.next);
            if(hash.containsKey(temp.next))
                return true;
            else
                hash.put(temp.next,temp.data);

            temp=temp.next;
        }
        return false;
    }

    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + "");
            temp=temp.next;
        }

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
        while(last.next!=null) {
            last = last.next;
        }

        last.next=new_node;
        return;
    }
}
