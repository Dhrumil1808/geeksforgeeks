package queue;

/**
 * Created by dhrumil on 6/25/17.
 */
public class queue_array {

    int front,rear,capacity,size;
    int arr[];
            public queue_array(int capacity)
            {
            this.capacity=capacity;
            front=size=0;
            rear=capacity-1;
            arr=new int[rear];
            }

            public boolean isFull(queue_array queue)
            {
                return queue.size==queue.capacity;
            }

            public boolean isEmpty(queue_array queue)
            {
                return queue.size == 0;
            }

        public void enqueue(int item)
        {
            if(isFull(this))
                return;

            this.rear=(this.rear + 1) %(this.capacity);
            arr[rear]=item;
            size=size + 1;
            System.out.println(item+ " enqueued to queue");
        }

    int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.rear];
    }

        public static void main(String[] args)
        {

            queue_array queue=new queue_array(10);
           // Queue queue = new Queue(1000);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);

            System.out.println(queue.dequeue() +
                    " dequeued from queue\n");

            System.out.println("Front item is " +
                    queue.front());

            System.out.println("Rear item is " +
                    queue.rear());

        }

}
