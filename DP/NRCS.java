package DP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhrumil on 6/16/17.
 */
public class NRCS {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       str=str.toLowerCase();
        //System.out.println(str);
        int[] letter=new int[26];
        for(int i=0;i<26;i++)
        {
            letter[i]= 0;
        }

        int cur_len=0;
        int max=0;
        int repeat=0;

        for(int j=0;j<str.length();j++)
        {


            int k=str.charAt(j);
            ///System.out.println(k);
            int index = k - 97;
            letter[index] = letter[index] + 1;
           // System.out.println(str.charAt(j) + " " +  index + " " +  letter[index]);


            if(letter[index]>1)
            {
                repeat++;
                if(max<cur_len)
                    max=cur_len;

                letter[index]=1;
                cur_len=1;
                for(int i=0;i<letter.length;i++)
                {
                    if(i!=index)
                    letter[i]=0;
                }
            }
            else
            {
                cur_len++;
            }
        }
        if(repeat==0)
            max=cur_len;
        System.out.println(max);


    }
}
