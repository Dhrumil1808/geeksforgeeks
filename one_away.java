import java.util.Scanner;

/**
 * Created by dhrumil on 6/6/17.
 */
public class one_away {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str_next=sc.nextLine();
        one_away one =new one_away();
        boolean result=one.change(str,str_next);
        System.out.println(result);


    }

    public boolean change(String str, String str1)
    {
        int difference= str.length() - str1.length();
        if(Math.abs(difference) > 1)
            return false;
        else if(str.length() ==  str1.length())
            return editreplace(str,str1);
        else if( str.length() + 1 == str1.length())
            return editinsert(str,str1);
        else if(str.length() == str1.length() + 1)
            return editinsert(str1,str);
        else
            return true;
    }

    public boolean editreplace(String str, String str1)
    {
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != str1.charAt(i))
                count++;
        }
        if(count<=1)
            return true;
        else
            return false;
    }

    public boolean editinsert(String str, String str1)
    {
        int index1=0;
        int index2=0;

        while(index1<str.length() && index2< str1.length())
        {
            if(str.charAt(index1) != str1.charAt(index2))
            {
                if(index1!=index2)
                    return false;
                else
                    index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;

    }
}
