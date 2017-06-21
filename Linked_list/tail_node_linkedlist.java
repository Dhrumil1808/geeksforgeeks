/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node node=new Node();
    
    if(head==null)
        {
       head=node;
        head.data=data;
        return head;
    }
    else
        {
        node=head;
        while(node.next!=null)
            node=node.next;
        
        
        node.next=new Node();
        node.next.data=data;
        
        return head;
    }
}
