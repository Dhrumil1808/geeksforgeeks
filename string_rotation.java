import java.util.Scanner;

/**
 * Created by dhrumil on 6/8/17.
 */
public class string_rotation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        StringBuilder str=new StringBuilder(2);
    boolean result=false;
        int len=str1.length();
        if(len==str2.length() && len >0)
        {
            str.append(str1);
            str.append(str1);
            result= isContains(str2,str.toString());

        }

    System.out.println(result);

    }

    public static boolean isContains(String str1, String str2)
    {
        return str2.contains(str1);
    }
}
