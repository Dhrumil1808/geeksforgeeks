package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dhrumil on 6/23/17.
 */
public class NGE {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }

        Stack<Integer> stack=new Stack<Integer>();
        stack.push(arr[0]);
        int next;
        for(int i=1;i<n;i++)
        {
            next=arr[i];

            int element = stack.pop();

            while(element < next)
            {
                System.out.println("element " + element + "next greater " + next);
                if(stack.isEmpty())
                    break;
                element=stack.pop();
            }

            if(element> next)
                stack.push(element);


            stack.push(next);
        }

        while(!stack.isEmpty())
        {
        int element=stack.pop();
        System.out.println("element " + element + "next greater " + -1);
        }
    }
}
