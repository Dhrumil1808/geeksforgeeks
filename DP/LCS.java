package DP;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/15/17.
 */
public class LCS {


    public void lcs(char[] X, char[] Y, int m, int n)
    {
        int k=0;
      //  StringBuilder str=new StringBuilder();
        int[][]  L=new int[m+1][n+1];
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1]) {
                    //str.append(X[i-1]);
                    //k++;
                    L[i][j] = L[i - 1][j - 1] + 1;
                }
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        int index=L[m][n];
        char[] lcs=new char[index+1];
        lcs[index]='\0';
        int i=m;
        int j=n;

        int temp=index;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (X[i-1] == Y[j-1])
            {
                // Put current character in result
                lcs[index-1] = X[i-1];

                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
        System.out.println(temp);
        for(k=0;k<=temp;k++)
            System.out.print(lcs[k]);
       // System.out.println(L[m][n]);
        //System.out.println(str.toString());

    }


    public int max(int a,int b)
    {
        return (a>b)? a:b;
    }

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    LCS lcs=new LCS();
    String s1=sc.next();
    String s2=sc.next();
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m=X.length;
    int n=Y.length;
   lcs.lcs(X,Y,m,n);
}
}


