import java.util.HashMap;
import java.util.Scanner;

class swap_nodes_linkedlist
{
    Node head;  // head of list

    /* Linked list Node*/

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
 
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /* Appends a new node at the end.  This method is 
       defined inside LinkedList class shown above */
    public void append(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }

    public void remove(int data)
    {
        Node temp=head;
        Node prev=null;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                i++;
                if(temp==head)
                {
                    //prev=temp;
                    head=temp.next;
                    return;
                }
                else {
                    prev.next = temp.next;
                    return;
                }
            }
            else {
                prev=temp;
                temp = temp.next;
            }
        }

        if(i==0)
            System.out.println("Node with key not found");

    }

    public boolean search(Node head, int x)

    {
        if(head==null)
            return false;
        else if(head.data==x)
            return true;
        else
            return search(head.next,x);

    }

    public void deletenode(int position)
    {
        Node temp=head,prev=null;
        int i=0,j=0;

        if(i==position) {
            head = temp.next;
            return;
        }
        while(temp!=null)
        {
            i++;
            prev = temp;
            temp = temp.next;
            if(i==position)
            {
                j++;
                prev.next=temp.next;
                return;
            }

        }
        if(j==0)
            System.out.println("entered position not found");


    }
    int i=-1;

    public Node ktolastrecursive(Node head,int k,int n)
    {
        Node p1=head;
        i++;

        if(n==k)
            return p1;

        else
            return ktolastrecursive(head.next,k,i);

    }

    //swap tow nodes given the data
    public void swap(int x,int y)
    {

        if(x==y)
            return;
        else
        {
            Node prevx=null, currx=head;
            while(currx!=null && currx.data!=x)
            {
                prevx=currx;
                currx=currx.next;
            }


            Node prevy=null, curry=head;
            while(curry!=null && curry.data!=y)
            {
                prevy=curry;
                curry=curry.next;
            }

            if(currx==null || curry==null) {
                System.out.println("Atleast one of the inputs not present in the linkedlist");
                return;
            }
            if(prevx!=null)
                prevx.next=curry;
            else
                head=curry;

            if(prevy!=null)
                prevy.next=currx;
            else
                head=currx;


            Node temp=currx.next;
            currx.next=curry.next;
            curry.next=temp;



        }
    }

    public int size()
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        return i;
    }
    int count=0;

    public int size(Node head)
    {
        if(head==null)
            return 0;

        else
            return 1 + size(head.next);
    }

    public Node ktolast(int k)
    {
        Node p1=head;
        //Node p3=head;

        for(int i=0;i<k;i++)
        {
            if(p1==null) {
                System.out.println("Input size bigger than size of linekdlist");
                System.exit(0);
            }
            else
                p1=p1.next;
        }


        //System.out.println(p1.data);

        return p1;


    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    /* Driver program to test above functions. Ideally this function
       should be in a separate user class.  It is kept here to keep
       code compact */
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();

        /* Start with the empty list */
        swap_nodes_linkedlist llist = new swap_nodes_linkedlist();

        // Insert 6.  So linked list becomes 6->NUllist
        // llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        // llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        //llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        // llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        // llist.insertAfter(llist.head.next, 8);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data;
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            llist.append(data);
            if(hash.containsKey(data))
            {
                llist.remove(data);
            }
            else {
                hash.put(data, data);
            }
        }


        Node result_recursive=llist.ktolastrecursive(llist.head,3,0);

        while(result_recursive!=null)
        {
            // System.out.println(result_recursive.data);
            result_recursive=result_recursive.next;
        }
        Node result=llist.ktolast(4);

        while(result!=null)
        {
            System.out.println(result.data);
            result=result.next;
        }

        int size=llist.size(llist.head);
        //System.out.println("size= " + size);
        boolean res=llist.search(llist.head,4);
        //System.out.println(res);

        llist.swap(4,8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();


    }
}