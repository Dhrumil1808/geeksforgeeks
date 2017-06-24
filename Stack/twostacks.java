package Stack;
import java.util.Scanner;
/**
 * Created by dhrumil on 6/23/17.
 */
public class twostacks {

    int size,top1,top2;
        int[] arr;
    public twostacks(int n)
    {
        size=n;
        top1=-1;
        top2=n;
         arr=new int[n];

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        twostacks ts=new twostacks(n);

        for(int i=0;i<n/2;i++)
        {
            ts.push1(sc.nextInt());
        }
        for(int i=n/2;i<n;i++)
        {
            ts.push2(sc.nextInt());
        }
        System.out.println("popped from stack 1" + ts.pop1());
        System.out.println("popped from stack 2" + ts.pop2());
        for(int i=0;i<n;i++)
            System.out.println(ts.arr[i]);
    }

    public void push1(int x)
    {
    if(top1 < top2-1)
    {
        top1++;
        arr[top1]=x;
    }
    else
    {
        System.out.println("Stack Overflow");
        System.exit(1);
    }
    }

    public void push2(int x)
    {
        if(top1<top2-1)
        {
            top2--;
            arr[top2]=x;
        }
        else
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public int pop1()
    {
        if(top1>=0)
        {

            int x=arr[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public int pop2()
    {
        if(top2<=size-1)
        {
            int x=arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

}
