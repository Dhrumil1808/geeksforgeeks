import java.util.*;

/**
 * Created by dhrumil on 6/5/17.
 */
public class palindrome_permute {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        palindrome_permute permute=new palindrome_permute();
        boolean bool=permute.pali_permute(str);
        System.out.println(bool);

    }

    public boolean pali_permute(String s)
    {
        boolean[]  bool=new boolean[128];
        int[] value=new int[128];
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i);
            value[val]++;

        }

        if(s.length() % 2==0)
        {


            for(int j=0;j<value.length;j++)
            {
                if(value[j]!=0)
                {
                    if(value[j]%2!=0)
                        return false;

                }



            }
            return true;
        }

        else
        {
            int even=0;
            int odd=0;
            for(int j=0;j<value.length;j++)
            {
                if(value[j]!=0)
                {
                    if(value[j]%2==0)
                        even+=value[j];
                    else
                        odd+=value[j];

                }
            }
            if(even%2==0 && odd%2!=0)
                return true;
            else
                return false;

        }


    }

}
