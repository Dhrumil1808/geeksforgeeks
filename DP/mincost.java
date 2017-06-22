package DP;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/16/17.
 */
public class mincost {

    static int min(int x,int y, int z)
    {
        if(x< y && x< z)
            return x;
        else if(y<x && y<z)
            return y;
        else
            return z;
    }


    static int min_cost(int[][] matrix,int m,int n)
    {
        int[][] dp=new int[m][n];

            dp[0][0]=matrix[0][0];
        for (int i = 1; i < m; i++)
            dp[i][0] = dp[i-1][0] + matrix[i][0];

        /* Initialize first row of tc array */
        for (int j = 1; j < n; j++)
            dp[0][j] = dp[0][j-1] + matrix[0][j];

        for(int i=1;i<m;i++) {
            for (int j = 1 ; j < n; j++) {

                dp[i][j] = min(dp[i][j - 1], dp[i - 1][j - 1], dp[i - 1][j]) + matrix[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               // System.out.println(dp[i][j]);
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("min cost: " + min_cost(matrix,m,n));
    }
}
