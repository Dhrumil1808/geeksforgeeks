package Stack;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dhrumil on 6/23/17.
 */
public class infixtopostfix {

    public static void main (String[] args)
    {

        String input="a+b*(c^d-e)^(f+g*h)-i";
        infixpostfix(input);

    }

    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    public static void infixpostfix(String exp)
    {
        String result=new String("");
        Stack<Character> st=new Stack<Character>();

        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c))
                result+=c;
            else if(c=='(')
                st.push(c);
            else if(c==')')
            {
                while(!st.isEmpty() && st.peek() !='(')
                {
                    result+=st.pop();
                }
                if(!st.isEmpty() && st.peek()!='(')
                    System.out.println("Invalid Expression");
                else
                    st.pop();
            }
            else
            {
                while(!st.isEmpty() && Prec(c) <=Prec(st.peek()))
                {
                    result+=st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty())
            result+=st.pop();

        System.out.println(result);
    }
}
