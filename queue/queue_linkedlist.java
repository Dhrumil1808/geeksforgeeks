package queue;

/**
 * Created by dhrumil on 6/25/17.
 */
public class queue_linkedlist {

    class QNode
    {
        int key;
        QNode next;

        public QNode(int key) {
            this.key = key;
            this.next = null;
        }
    }

    QNode front, rear;

    public queue_linkedlist() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key)
    {

        // Create a new LL node
        QNode temp = new QNode(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null)
        {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    QNode dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return null;

        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
        return temp;
    }
    public static void main(String[] args)
    {
        queue_linkedlist q=new queue_linkedlist();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Dequeued item is "+ q.dequeue().key);
    }
}
