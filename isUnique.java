import java.util.*;
/**
 * Created by dhrumil on 6/5/17.
 */
public class isUnique {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        boolean[] bool=new boolean[128];

        //char[] chars=input.toCharArray();
        boolean isunique=false;

        for(int i=0;i<input.length();i++)
        {
            int val=input.charAt(i);
            if(bool[val] == true)
            {
                isunique=false;
            }
            else {
                bool[val] = true;
                isunique = true;
            }
        }

        System.out.println(isunique);
    }
}

