package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dhrumil on 9/7/17.
 */
public class BFS {

    Node root;

    public void bfs()
    {
            Node queues;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);

        while(queue.size()!=0)
        {
            queues=queue.poll();
            System.out.println(queues.data+ " ");
            if(queues.left!=null)
            {
                Node q=queues.left;
                queue.add(q);

            }
            if(queues.right!=null)
            {
                Node q=queues.right;
                queue.add(q);
            }




        }

    }
    public static void main(String args[])
    {
        BFS tree = new BFS();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.bfs();
    }
}
