import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/10/17.
 */
public class linked_list_remove_dups {

    public static void main(String[] args)
    {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        LinkedList li=new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int data=0;
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            li.add(data);
            if(hash.containsKey(data))
            {
                li.removeLastOccurrence(data);
            }
            else
            {
                hash.put(data,data);
            }
        }

        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
    }
}
