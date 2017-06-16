package DP;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/16/17.
 */
public class editstrings {

    static int min(int x, int y, int z)
    {
        if(x< y &&x < z)
            return x;
        else if(y<x && y<z)
            return y;
        else
            return z;
    }

  static int editDP(String str1, String str2, int m, int n)
  {
      int[][] dp=new int[m+1][n+1];

      for(int i=0;i<m;i++)
      {
          dp[i][0]=i;
      }

      for(int j=0;j<m;j++)
      {
          dp[0][j]=j;
      }
      for(int i=1;i<=m;i++)
      {
          for(int j=1;j<=n;j++)
          {
               if(str1.charAt(i-1) == str2.charAt(j-1))
                  dp[i][j]=dp[i-1][j-1];
              else
                  dp[i][j]= 1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);


          }
      }
      return dp[m][n];
  }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("Minimum transformations:   "  + editDP(str1,str2,str1.length(),str2.length()));
    }
}
