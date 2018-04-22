package Stack;
import java.util.Scanner;

/**
 * Created by dhrumil on 8/29/17.
 */
public class Solution {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();

        String string2=sc.nextLine();

        char[] char1=string1.toCharArray();
        char[] char2=string2.toCharArray();
        int[] diff=new int[char1.length];
        for(int i=0;i<char1.length;i++)
        {
            //System.out.println((int) char2[i]);
            //System.out.println((int) char1[i]);

            if((int) char2[i]==32)
            {
                diff[i]= 27;
            }
            else {
                int difference = (int) (char1[i]) - (int) (char2[i]);
                if (difference > 0) {
                    diff[i] = difference;
                } else if (difference < 0) {
                    diff[i] = 26 - Math.abs(difference);
                }
            }
        }


        for(int j=0;j<diff.length;j++)
        {

                if(diff[j]<= 26)
            System.out.print(diff[j]+ " ");
        }

    }


}

