package Stack;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/23/17.
 */
public class Stack_array {

        static final int MAX=1000;
        int[] a=new int[MAX];
        int top;

        public boolean isEmpty()
        {
            return top < 0;
        }
        public Stack_array()
        {
            top=-1;
        }

        public boolean push(int x)
        {
            if(top >= MAX) {
                System.out.println("Stack overflow");
                return false;
            }
            else
            {
                a[++top]=x;
                return true;
            }
        }

        public int pop()
        {
            if(top<0)
            {
                System.out.println("Stack underflow");
                return 0;
            }
            else
            {
                int x=a[top--];
                return x;
            }
        }

        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
                Stack_array s=new Stack_array();
            for(int i=0;i<n;i++)
            {
                int data=sc.nextInt();
                s.push(data);
            }

            System.out.println(s.pop());
        }

}
