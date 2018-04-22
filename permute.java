import java.util.*;


/**
 * Created by dhrumil on 6/5/17.
 */
public class permute {
    public boolean permutation(String s, String t)
    {
        char[] content=s.toCharArray();
        java.util.Arrays.sort(content);
        String sorted="";
        String sorted_t="";

        char[] content_t=t.toCharArray();

        for(int i=0;i<content.length;i++)
        {
            sorted +=content[i];
        }
        for(int i=0;i<content_t.length;i++)
        {
            sorted_t +=content_t[i];
        }

        if(sorted.length()!=t.length())
            return false;
        else
            return sorted.equals(sorted_t);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        permute perm=new permute();
        boolean bool=perm.permutation(str1,str2);
        System.out.println(bool);
    }
}
