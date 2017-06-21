/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
       
    if (position == 0){
       Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
    else {
        Node node=head;
        while(--position > 0){
            node = node.next;
        }
        Node i = node.next;
        node.next = new Node();
        node.next.data = data;
        node.next.next = i;
        return head;
    }
}
