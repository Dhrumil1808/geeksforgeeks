package DP;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/16/17.
 */
public class palindomic_subsequence {


    public static int palindrome(String str)
    {

        int n=str.length();
        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++)
        {
            dp[i][i]=1;
        }

        for(int k=2;k<=n;k++)
        {
            for(int i=0;i<n-k + 1;i++)
            {
                int j= i + k - 1;
                if(str.charAt(i)==str.charAt(j) && k==2)
                    dp[i][j]=2;
                else if(str.charAt(i)==str.charAt(j))
                    dp[i][j]= 2 + dp[i+1][j-1];
                else
                    dp[i][j]=max(dp[i][j-1],dp[i+1][j]);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("--------");
            for(int j=0;j<n;j++)
            {
                System.out.print("|");
                System.out.print(dp[i][j]);
            }
            System.out.println("");
        }

       /* for (int cl=2; cl<=n; cl++)
        {
            for (int i=0; i<n-cl+1; i++)
            {
            int    j = i+cl-1;
                if (str.charAt(i) == str.charAt(j) && cl == 2)
                    dp[i][j] = 2;

                else if (str.charAt(i) == str.charAt(j))
                    dp[i][j] = dp[i+1][j-1] + 2;
                else
                    dp[i][j] = max(dp[i][j-1], dp[i+1][j]);
            }
        }*/


        return dp[0][n-1];
    }

    public static int max(int x, int y)
    {
        if(x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int length=palindrome(str);
        System.out.println(length);

    }
}
