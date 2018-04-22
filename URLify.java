import java.util.*;
/**
 * Created by dhrumil on 6/5/17.
 */
public class URLify {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=sc.nextInt();
        URLify urls=new URLify();
        String res=urls.replace_string(str,len);
        System.out.println(res);
    }


    public String replace_string(String s,int length)
    {
        String result="";
        char[] url=new char[length];
        for(int i=0;i<length;i++)
        {
            int val=s.charAt(i);

            if(val ==32)
            {
              result += "%20";
            }
            else
            {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
