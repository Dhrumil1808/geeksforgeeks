package Tree;

/**
 * Created by dhrumil on 9/6/17.
 */
public class Inorder_morris {

    Node root;

    public void inorder()
    {
        Node current, pre;

        if (root == null)
            return;

        current = root;
            while(current!=null)
            {
                if(current.left==null)
                {
                    System.out.println(current.data + " ");
                    current=current.right;
                }
                else
                {
                    pre=current.left;
                    while(pre.right!=null && pre.right!=current)
                    {
                        pre=pre.right;
                    }

                    if(pre.right==null)
                    {
                        pre.right=current;
                        current=current.left;
                    }
                    else
                    {
                        pre.right=null;
                        System.out.println(current.data + " ");
                        current=current.right;
                    }
                }
            }
    }


    public static void main(String args[])
    {
        Inorder_morris tree = new Inorder_morris();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.inorder();
    }
}
