package DP.Graph;

import java.util.Scanner;

/**
 * Created by dhrumil on 6/19/17.
 */
public class max_sum_array {


    public static int max_sum(int[] a)
    {
        int max_end_here=0;
        int max_far_here=0;
        int start =0, end = 0, s=0;
        for(int i=0;i<a.length;i++) {
            max_end_here = max_end_here + a[i];
            if (max_end_here < 0) {
                max_end_here = 0;
                s = i + 1;
            } else if (max_far_here < max_end_here) {
                max_far_here = max_end_here;
                start = s;
                end = i;
            }
        }

        return max_far_here;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=max_sum(arr);
        System.out.println(max);

    }
}
