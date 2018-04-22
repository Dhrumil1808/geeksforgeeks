import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/10/17.
 */
public class kthtolast_linkedlist {

    LinkedList list=new LinkedList();
    static kthtolast_linkedlist li=new kthtolast_linkedlist();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data;
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            li.list.add(data);

        }

        int position=sc.nextInt();
        li.returnnodes(position);


    }

    public void returnnodes(int position)
    {
        if(position>=list.size())
        {
            System.out.println("entered position is greater than linkedlist size");
        }
        else {
            for (int i = position; i < list.size(); i++) {
                System.out.println(li.list.get(i));
            }
        }
    }

}
