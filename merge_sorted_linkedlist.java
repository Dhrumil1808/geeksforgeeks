import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by dhrumil on 6/12/17.
 */
public class merge_sorted_linkedlist {

    Node head;
    TreeMap<Integer,Integer> tree=new TreeMap<>();
    public class Node
    {
        Node next;
        int data;
        Node(int d) {
            data=d;
            next=null;
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
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;

    }

    public void sort(Node head)
    {

        Node temp=head;
        Node temp1=head;
        while(temp1!=null)
        {
            tree.put(temp1.data,temp1.data);
            temp1=temp1.next;
        }

        for(int i=0;i<tree.size();i++)
        {
            System.out.println(tree.get(temp));
        temp.data=tree.get(i);
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

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            merge_sorted_linkedlist li=new merge_sorted_linkedlist();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
                li.append(data);
        }
        li.sort(li.head);
        li.printlist();
    }
}
