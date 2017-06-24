package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dhrumil on 6/23/17.
 */
public class parenthesis {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String input=sc.next();
            Stack<Character> st=new Stack<Character>();
            boolean flag=true;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else if(ch=='}' && st.peek()=='{')
                st.pop();
            else if(ch==']' && st.peek()=='[')
                st.pop();
            else if(ch==')' && st.peek()=='(')
                st.pop();

        }
        if(!st.isEmpty())
            flag=false;

        System.out.println(flag);
    }
}
