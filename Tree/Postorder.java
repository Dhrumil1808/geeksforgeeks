package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by dhrumil on 9/5/17.
 */

public class Postorder {

    Node root;
    //boolean[] visited=new boolean[7];
    void postorder()
    {
        ArrayList<Integer> arrays=new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();

        Node node=root;
        while(node!=null)
        {

            stack.push(node);
            node=node.left;
        }

            while(stack.size() > 0)
            {
                node=stack.pop();
               // System.out.print(node.data + "nullss");
                boolean bool=false;
                boolean bool_left=false;
                boolean bool_right=false;
                if((node.left==null && node.right==null)) {
                    arrays.add(node.data);
                    System.out.print(node.data + " ");
                    bool=true;
                }

                Iterator<Integer> iter=arrays.listIterator();
                if(!bool) {
                    while (iter.hasNext()) {
                        int i = iter.next();
                        if (i == node.left.data) {
                            bool_left = true;


                        }
                        if (i == node.right.data) {

                            bool_right=true;

                        }
                    }
                }

                if(bool_left && bool_right) {
                    bool = true;
                    arrays.add(node.data);
                    System.out.print(node.data + " ");
                }


                if(!bool) {
                    stack.push(node);

                    if (!bool_right) {
                        if (node.right != null) {
                            Node nodes = node.right;
                            //visited[node.data-1]=true;
                            arrays.add(nodes.data);
                            stack.push(nodes);
                        }
                    }

                    if (!bool_left) {

                        if (node.left != null) {
                            Node nodes = node.left;
                            //visited[node.data-1]=true;
                            arrays.add(nodes.data);
                            stack.push(nodes);
                        }
                    }
                }

            }


    }

    public static void main(String args[]) {

        Postorder tree = new Postorder();
        tree.root=new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.postorder();
    }

}
