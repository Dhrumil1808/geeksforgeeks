import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by dhrumil on 6/5/17.
 */
public class palindromne_permute_map {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        palindromne_permute_map permute=new palindromne_permute_map();
        boolean bool=permute.pali_permute(str);
        System.out.println(bool);
    }

    public boolean pali_permute(String s)
    {
        HashMap<Character,Integer> hash=new HashMap<>();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int val=0;
            if(hash.containsKey(c[i]))
            {
               int value=hash.get(c[i]);
              // System.out.println(value);
                value += 1;
               hash.put(c[i],value);

            }
            else
            {
                val+=1;
                hash.put(c[i],val);
            }

        }
        Iterator it=hash.entrySet().iterator();

            int even=0;
            int count=0;
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if((int) pair.getValue() % 2!=0)
                    count++;
                else
                    even+=(int) pair.getValue();
            }


            if((even%2==0 && count<=1))
                return true;
            else
                return false;



    }
}
