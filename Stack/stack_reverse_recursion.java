package Stack;

import java.util.Scanner;
import java.util.Stack;
/**
 * Created by dhrumil on 6/24/17.
 */
public class stack_reverse_recursion {
    Stack<Integer> stack=new Stack<Integer>();
    public static void main(String[] args)
    {
        stack_reverse_recursion stack_reverse=new stack_reverse_recursion();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            stack_reverse.stack.push(data);

        }
        System.out.println(stack_reverse.stack);
        stack_reverse.reverse();
        System.out.println(stack_reverse.stack);
    }


    public void reverse()
    {
        if(!stack.isEmpty()) {
            int x=stack.peek();
            stack.pop();
            reverse();
            insert(x);
        }

    }
    public void insert(int x)
    {
        if(stack.isEmpty())
            stack.push(x);
        else
        {
            int a=stack.peek();
            stack.pop();
            insert(x);
            stack.push(a);
        }

    }

}
