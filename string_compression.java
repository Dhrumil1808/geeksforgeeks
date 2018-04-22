import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/6/17.
 */
public class string_compression {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        string_compression compress=new string_compression();
        String result=compress.string_compress(str);
        System.out.println(result);

    }

    public String string_compress(String str)
    {
        int count=1;
        StringBuilder result=new StringBuilder();
        HashMap<Character,Integer> hash=new HashMap<>();
        //char[] c = str.toCharArray();
        for(int i=0;i<str.length()-1;i++)
        {

            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
                if(i==str.length()-2) {
                    result.append(str.charAt(i));
                    result.append(count);
                }
            }
            else
            {
               // System.out.println(str.charAt(i));
               // System.out.println(count);

                result.append(str.charAt(i));
                result.append(count);
                count=1;
            }


        }
        return result.length() <str.length() ? result.toString() : str;
    }
}
