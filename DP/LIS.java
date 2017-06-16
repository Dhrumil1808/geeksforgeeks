package DP;
import java.util.Scanner;


public class LIS
{
    /* lis() returns the length of the longest increasing
       subsequence in arr[] of size n */
    static int lis(int arr[],int n)
    {

        int[] lis=new int[n];
        int i,j,max=0;
        for(i=0;i<lis.length;i++)
        {
            lis[i]=1;
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(arr[j] < arr[i] && lis[i] < lis[j]+1) lis[i] = lis[j] + 1;
            }
        }
        for(i=0;i<lis.length;i++)
        {
            if(max<lis[i])
                max=lis[i];
        }
        return max;
    }

    static int _lis(int[] arr,int n)
    {
        if(n==1)
            return 1;
        else {
            int res = 1;
            int max_ending = 1;

            for(int i=1;i<n;i++)
            {
                res=_lis(arr,i);
                if(arr[i-1]<arr[n-1] && res > max_ending + 1)
                    max_ending=res + 1;
            }

            return max_ending;

        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Length of lis is " + _lis( arr, n ) + "\n" );
    }
}