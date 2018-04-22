package Stack;
import java.util.Scanner;

/**
 * Created by dhrumil on 8/29/17.
 */
public class Solution1 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String result=decrypt(string1);
        System.out.println(result);

    }

    public static String decrypt(String encrypted_message) {

        String result="";
        char[] dif=encrypted_message.toCharArray();
        int[] diff={8,2,5,1,2,2,0};
        int difference=0;
        int[] decrypt=new int[encrypted_message.length()];

        int j=0;
        for(int i=0;i<dif.length;i++)
        {

            if((int) dif[i]==32)
            {
                decrypt[i]=32;
                j++;
            }
            if((int) dif[i]>=65 && (int) dif[i]<=90)
            {

                difference = dif[i] - diff[Math.abs(i-j)%7];
                if(difference < 65)
                {
                    difference  = 91 - (65 - difference);
                    decrypt[i]=difference;
                }
                else
                {
                    decrypt[i]=difference;
                }
            }

            if((int) dif[i]>=97 && (int) dif[i]<=122)
            {
                difference = dif[i] - diff[Math.abs(i-j)%7];
                if(difference < 97)
                {
                    difference  = 123 - (97 - difference);
                    decrypt[i]=difference;
                }
                else
                {
                    decrypt[i]=difference;
                }
            }
        }


        for(int i=0;i<decrypt.length;i++)
        {
            char a =(char) decrypt[i];
            result +=a;
        }
    return result;
    }

}

