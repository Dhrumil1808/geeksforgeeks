package Tree;

import java.util.Stack;

/**
 * Created by dhrumil on 9/6/17.
 */
public class Postorder_twostack {

    Node root;

    public void postorder()
    {
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();

        if(root==null)
            return;

        Node node=root;
        s1.push(node);

        while(s1.size() > 0)
        {
            node=s1.pop();
            s2.push(node);
            //System.out.println(1);

            if(node.left!=null)
                s1.push(node.left);

            if(node.right!=null)
                s1.push(node.right);

        }

        while(s2.size()>0)
        {
            Node nodes=s2.pop();
            System.out.print(nodes.data + " ");
        }




    }
    public static void main(String args[])
    {
        Postorder_twostack post=new Postorder_twostack();

        post.root = new Node(1);
        post.root.left = new Node(2);
        post.root.right = new Node(3);
        post.root.left.left = new Node(4);
        post.root.left.right = new Node(5);
        post.root.right.left = new Node(6);
        post.root.right.right = new Node(7);

        post.postorder();
    }
}
