/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
   
    int count=0;
    
    if(headA==null && headB==null)
        return 1;
    
    while(headA!=null && headB!=null)
        {
        //System.out.print(headA.data);
        ///System.out.println(headB.data);
        if(headA.data!=headB.data)
            {
            count++;
        }
        headA=headA.next;
        headB=headB.next;
    }
    if(headA==null && headB==null)
        {
        
    if(count>0)
        return 0;
    else
        return 1;
}
    else
        return 0;
    
  
}
