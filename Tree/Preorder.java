package Tree;

import java.util.Stack;



class Preorder {

    Node root;
    void preorder()
    {
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.size()> 0) {

            // Pop the top item from stack and print it
            Node mynode = nodeStack.pop();
            System.out.print(mynode.data + " ");
            //nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }


    }

    public static void main(String args[]) {

        Preorder tree = new Preorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.preorder();
    }
}