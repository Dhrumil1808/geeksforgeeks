private class LinkedListIterator implements Iterator<AnyType>
{
	 private Node<AnyType> nextNode;

   public LinkedListIterator()
   {
      nextNode = head;
   }

   public AnyType next()
{
   if(!hasNext()) throw new NoSuchElementException();
   AnyType res = nextNode.data;
   nextNode = nextNode.next;
   return res;
}
//adds node at the beginning of the list
public void addFirst(AnyType item)
{
   head = new Node<AnyType>(item, head);
}

//traverse the linked list
Node tmp = head;

while(tmp != null) tmp = tmp.next;

//appends node to the end of the list
public void addLast(AnyType item)
{
   if(head == null) addFirst(item);
   else
   {
      Node<AnyType> tmp = head;
      while(tmp.next != null) tmp = tmp.next;

      tmp.next = new Node<AnyType>(item, null);
   }
}

//Find a node containing "key" and insert a new node after it.
public void insertAfter(AnyType key, AnyType toInsert)
{
   Node<AnyType> tmp = head;
   while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

   if(tmp != null)
      tmp.next = new Node<AnyType>(toInsert, tmp.next);
}

//Find a node containing "key" and insert a new node before it.
public void insertBefore(AnyType key, AnyType toInsert)
{
   if(head == null) return null;
   if(head.data.equals(key))
   {
      addFirst(toInsert);
      return;
   }

   Node<AnyType> prev = null;
   Node<AnyType> cur = head;

   while(cur != null && !cur.data.equals(key))
   {
      prev = cur;
      cur = cur.next;
   }
   //insert between cur and prev
   if(cur != null) prev.next = new Node<AnyType>(toInsert, cur);
}


//Find a node containing "key" and delete it.
public void remove(AnyType key)
{
   if(head == null) throw new RuntimeException("cannot delete");

   if(head.data.equals(key) )
   {
      head = head.next;
      return;
   }

   Node<AnyType> cur  = head;
   Node<AnyType> prev = null;

   while(cur != null && !cur.data.equals(key) )
   {
      prev = cur;
      cur = cur.next;
   }

   if(cur == null) throw new RuntimeException("cannot delete");

   //delete cur node
   prev.next = cur.next;
}

public LinkedList<AnyType> copy3()
{
   if(head==null) return null;
   LinkedList<AnyType> twin = new LinkedList<AnyType>();
   Node tmp = head;
   twin.head = new Node<AnyType>(head.data, null);
   Node tmpTwin = twin.head;

   while(tmp.next != null)
   {
      tmp = tmp.next;
      tmpTwin.next = new Node<AnyType>(tmp.data, null);
      tmpTwin = tmpTwin.next;
   }

   return twin;
}

}