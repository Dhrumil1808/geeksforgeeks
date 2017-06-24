package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dhrumil on 6/23/17.
 */
public class postfix {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<Integer>();
        int result=0;
        for(int i=0;i<n;i++)
        {
            String data=sc.next();
            if(data.equals("+") || data.equals("-")|| data.equals("*") || data.equals("/"))
            {
                if(stack.size()>=2)
                {
                    int op1=stack.pop();
                    int op2=stack.pop();

                   // result = op1 + data + op2;
                    if(data.equals("+"))
                    {
                         result= op1 + op2;
                    }

                    if(data.equals("-"))
                    {
                         result= op1 - op2;
                    }
                    if(data.equals("*"))
                    {
                         result= op1 * op2;
                    }
                    if(data.equals("/"))
                    {
                         result= op1 / op2;
                    }
                    stack.push(result);
                  //  System.out.println("result= " +result);
                }

            }
            else
            {
                stack.push(Integer.parseInt(data));
         //       System.out.println(Integer.parseInt(data));

            }

        }

        if(!stack.isEmpty())
        {
            result=stack.pop();
        }
        System.out.println(result);
    }
}
